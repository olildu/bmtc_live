package app.chalo.features.checkout;

import app.chalo.models.ordercreation.OrderPaymentProviderInfoAppModel;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/features/checkout/CheckoutPaymentData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/features/checkout/CheckoutPaymentData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class CheckoutPaymentData$$serializer implements GeneratedSerializer<CheckoutPaymentData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CheckoutPaymentData$$serializer f2692a;
    private static final SerialDescriptor descriptor;

    static {
        CheckoutPaymentData$$serializer checkoutPaymentData$$serializer = new CheckoutPaymentData$$serializer();
        f2692a = checkoutPaymentData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.features.checkout.CheckoutPaymentData", checkoutPaymentData$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("orderData", false);
        pluginGeneratedSerialDescriptor.j("userDetails", false);
        pluginGeneratedSerialDescriptor.j("agency", false);
        pluginGeneratedSerialDescriptor.j("paymentProviderAppModel", false);
        pluginGeneratedSerialDescriptor.j("paymentProviderVpaConfig", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{CheckoutOrderData$$serializer.f2690a, CheckoutUserDetails$$serializer.f2698a, StringSerializer.f18170a, CheckoutPaymentData.f[3].getValue(), BuiltinSerializersKt.c(CheckoutPaymentProviderVpaConfig$$serializer.f2694a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        CheckoutOrderData checkoutOrderData;
        CheckoutUserDetails checkoutUserDetails;
        String str;
        OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel;
        CheckoutPaymentProviderVpaConfig checkoutPaymentProviderVpaConfig;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = CheckoutPaymentData.f;
        CheckoutOrderData checkoutOrderData2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            CheckoutOrderData checkoutOrderData3 = (CheckoutOrderData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, CheckoutOrderData$$serializer.f2690a, null);
            CheckoutUserDetails checkoutUserDetails2 = (CheckoutUserDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, CheckoutUserDetails$$serializer.f2698a, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            orderPaymentProviderInfoAppModel = (OrderPaymentProviderInfoAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            checkoutOrderData = checkoutOrderData3;
            checkoutPaymentProviderVpaConfig = (CheckoutPaymentProviderVpaConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, CheckoutPaymentProviderVpaConfig$$serializer.f2694a, null);
            str = strDecodeStringElement;
            i = 31;
            checkoutUserDetails = checkoutUserDetails2;
        } else {
            boolean z = true;
            int i2 = 0;
            CheckoutUserDetails checkoutUserDetails3 = null;
            String strDecodeStringElement2 = null;
            OrderPaymentProviderInfoAppModel orderPaymentProviderInfoAppModel2 = null;
            CheckoutPaymentProviderVpaConfig checkoutPaymentProviderVpaConfig2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    checkoutOrderData2 = (CheckoutOrderData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, CheckoutOrderData$$serializer.f2690a, checkoutOrderData2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    checkoutUserDetails3 = (CheckoutUserDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, CheckoutUserDetails$$serializer.f2698a, checkoutUserDetails3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    orderPaymentProviderInfoAppModel2 = (OrderPaymentProviderInfoAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), orderPaymentProviderInfoAppModel2);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    checkoutPaymentProviderVpaConfig2 = (CheckoutPaymentProviderVpaConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, CheckoutPaymentProviderVpaConfig$$serializer.f2694a, checkoutPaymentProviderVpaConfig2);
                    i2 |= 16;
                }
            }
            i = i2;
            checkoutOrderData = checkoutOrderData2;
            checkoutUserDetails = checkoutUserDetails3;
            str = strDecodeStringElement2;
            orderPaymentProviderInfoAppModel = orderPaymentProviderInfoAppModel2;
            checkoutPaymentProviderVpaConfig = checkoutPaymentProviderVpaConfig2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CheckoutPaymentData(i, checkoutOrderData, checkoutUserDetails, str, orderPaymentProviderInfoAppModel, checkoutPaymentProviderVpaConfig);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CheckoutPaymentData value = (CheckoutPaymentData) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = CheckoutPaymentData.f;
        CheckoutOrderData$$serializer checkoutOrderData$$serializer = CheckoutOrderData$$serializer.f2690a;
        CheckoutOrderData checkoutOrderData = value.f2691a;
        CheckoutPaymentProviderVpaConfig checkoutPaymentProviderVpaConfig = value.e;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, checkoutOrderData$$serializer, checkoutOrderData);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, CheckoutUserDetails$$serializer.f2698a, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), value.d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || checkoutPaymentProviderVpaConfig != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, CheckoutPaymentProviderVpaConfig$$serializer.f2694a, checkoutPaymentProviderVpaConfig);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
