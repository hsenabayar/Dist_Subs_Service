require 'google/protobuf'
require_relative 'dist_servers/message_pb'  # Protobuf mesajını tanımlayan dosya

# Include the generated Protobuf module
include DistServers::Message

# Örnek bir Protobuf mesajı oluşturma
message = DistServers::Message.new
message.field1 = 123
message.field2 = "Example Message"

# Protobuf mesajını ekrana yazdırma
puts message.to_s

# Örnek bir işlem (Protobuf mesajını bir sunucuya gönderme)
def send_message_to_server(message)
  # Sunucu işlemi burada gerçekleştirilebilir
  puts "Mesaj gönderildi: #{message}"
end

send_message_to_server(message)
