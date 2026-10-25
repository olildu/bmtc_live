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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/models/ordercreation/OrderPaymentProviderInfo.Basic.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/models/ordercreation/OrderPaymentProviderInfo$Basic;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class OrderPaymentProviderInfo$Basic$$serializer implements GeneratedSerializer<OrderPaymentProviderInfo.Basic> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OrderPaymentProviderInfo$Basic$$serializer f5649a;
    private static final SerialDescriptor descriptor;

    static {
        OrderPaymentProviderInfo$Basic$$serializer orderPaymentProviderInfo$Basic$$serializer = new OrderPaymentProviderInfo$Basic$$serializer();
        f5649a = orderPaymentProviderInfo$Basic$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.models.ordercreation.OrderPaymentProviderInfo.Basic", orderPaymentProviderInfo$Basic$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("customer", false);
        pluginGeneratedSerialDescriptor.j("providerConfig", false);
        pluginGeneratedSerialDescriptor.j("providerId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.c(OrderPaymentProviderCustomerDetails$$serializer.f5645a), BuiltinSerializersKt.c(OrderProviderConfig$$serializer.f5664a), IntSerializer.f18146a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        int i;
        OrderPaymentProviderCustomerDetails orderPaymentProviderCustomerDetails;
        OrderProviderConfig orderProviderConfig;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            orderPaymentProviderCustomerDetails = (OrderPaymentProviderCustomerDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, OrderPaymentProviderCustomerDetails$$serializer.f5645a, null);
            orderProviderConfig = (OrderProviderConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OrderProviderConfig$$serializer.f5664a, null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            i = 7;
        } else {
            boolean z = true;
            int iDecodeIntElement2 = 0;
            OrderPaymentProviderCustomerDetails orderPaymentProviderCustomerDetails2 = null;
            OrderProviderConfig orderProviderConfig2 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    orderPaymentProviderCustomerDetails2 = (OrderPaymentProviderCustomerDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, OrderPaymentProviderCustomerDetails$$serializer.f5645a, orderPaymentProviderCustomerDetails2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    orderProviderConfig2 = (OrderProviderConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, OrderProviderConfig$$serializer.f5664a, orderProviderConfig2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i2 |= 4;
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            i = i2;
            orderPaymentProviderCustomerDetails = orderPaymentProviderCustomerDetails2;
            orderProviderConfig = orderProviderConfig2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OrderPaymentProviderInfo.Basic(i, orderPaymentProviderCustomerDetails, orderProviderConfig, iDecodeIntElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        OrderPaymentProviderInfo.Basic value = (OrderPaymentProviderInfo.Basic) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OrderPaymentProviderInfo.Basic.Companion companion = OrderPaymentProviderInfo.Basic.INSTANCE;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, OrderPaymentProviderCustomerDetails$$serializer.f5645a, value.f5648a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, OrderProviderConfig$$serializer.f5664a, value.b);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
