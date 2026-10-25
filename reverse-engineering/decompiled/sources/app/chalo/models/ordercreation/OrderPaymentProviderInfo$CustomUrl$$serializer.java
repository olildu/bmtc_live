package app.chalo.models.ordercreation;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/models/ordercreation/OrderPaymentProviderInfo.CustomUrl.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$CustomUrl;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class OrderPaymentProviderInfo$CustomUrl$$serializer implements GeneratedSerializer<OrderPaymentProviderInfo.CustomUrl> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OrderPaymentProviderInfo$CustomUrl$$serializer f5651a;
    private static final SerialDescriptor descriptor;

    static {
        OrderPaymentProviderInfo$CustomUrl$$serializer orderPaymentProviderInfo$CustomUrl$$serializer = new OrderPaymentProviderInfo$CustomUrl$$serializer();
        f5651a = orderPaymentProviderInfo$CustomUrl$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.models.ordercreation.OrderPaymentProviderInfo.CustomUrl", orderPaymentProviderInfo$CustomUrl$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("customer", false);
        pluginGeneratedSerialDescriptor.j("providerConfig", false);
        pluginGeneratedSerialDescriptor.j("providerId", false);
        pluginGeneratedSerialDescriptor.j("paymentUrl", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.c(OrderPaymentProviderCustomerDetails$$serializer.f5645a), BuiltinSerializersKt.c(OrderProviderConfig$$serializer.f5664a), IntSerializer.f18146a, BuiltinSerializersKt.c(StringSerializer.f18170a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        int i2;
        OrderPaymentProviderCustomerDetails orderPaymentProviderCustomerDetails;
        OrderProviderConfig orderProviderConfig;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            OrderPaymentProviderCustomerDetails orderPaymentProviderCustomerDetails2 = (OrderPaymentProviderCustomerDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, OrderPaymentProviderCustomerDetails$$serializer.f5645a, null);
            OrderProviderConfig orderProviderConfig2 = (OrderProviderConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OrderProviderConfig$$serializer.f5664a, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            orderPaymentProviderCustomerDetails = orderPaymentProviderCustomerDetails2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, null);
            i = iDecodeIntElement;
            orderProviderConfig = orderProviderConfig2;
            i2 = 15;
        } else {
            boolean z = true;
            int iDecodeIntElement2 = 0;
            OrderPaymentProviderCustomerDetails orderPaymentProviderCustomerDetails3 = null;
            OrderProviderConfig orderProviderConfig3 = null;
            String str2 = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    orderPaymentProviderCustomerDetails3 = (OrderPaymentProviderCustomerDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, OrderPaymentProviderCustomerDetails$$serializer.f5645a, orderPaymentProviderCustomerDetails3);
                    i3 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    orderProviderConfig3 = (OrderProviderConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OrderProviderConfig$$serializer.f5664a, orderProviderConfig3);
                    i3 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i3 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str2);
                    i3 |= 8;
                }
            }
            i = iDecodeIntElement2;
            i2 = i3;
            orderPaymentProviderCustomerDetails = orderPaymentProviderCustomerDetails3;
            orderProviderConfig = orderProviderConfig3;
            str = str2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OrderPaymentProviderInfo.CustomUrl(i2, orderPaymentProviderCustomerDetails, orderProviderConfig, i, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        OrderPaymentProviderInfo.CustomUrl value = (OrderPaymentProviderInfo.CustomUrl) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OrderPaymentProviderInfo.CustomUrl.Companion companion = OrderPaymentProviderInfo.CustomUrl.INSTANCE;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, OrderPaymentProviderCustomerDetails$$serializer.f5645a, value.f5650a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, OrderProviderConfig$$serializer.f5664a, value.b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
