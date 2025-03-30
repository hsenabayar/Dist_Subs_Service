require 'protobuf'

class Message
  include Protobuf::Message

  required :string, :demand, 1
  optional :string, :response, 2
  optional :int32, :server1_status, 3
  optional :int64, :timestamp, 4
end
