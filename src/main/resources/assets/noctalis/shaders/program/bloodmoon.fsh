#version 150

uniform sampler2D DiffuseSampler;
in vec2 texCoord;
out vec4 fragColor;

void main() {
    vec4 color = texture(DiffuseSampler, texCoord);

    float gray = dot(color.rgb, vec3(0.3, 0.59, 0.11));
    vec3 bw = vec3(gray);

    // garder le rouge
    fragColor = vec4(max(bw, vec3(color.r, 0.0, 0.0)), color.a);
}
