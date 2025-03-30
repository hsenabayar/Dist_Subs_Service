require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "Message" do
    optional :field1, :int32, 1
    optional :field2, :string, 2
  end
end

class Message
  include Google::Protobuf::MessageExts
  extend Google::Protobuf::MessageExts::ClassMethods
end
