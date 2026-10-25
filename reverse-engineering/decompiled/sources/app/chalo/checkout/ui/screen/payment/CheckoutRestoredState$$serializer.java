package app.chalo.checkout.ui.screen.payment;

import app.chalo.checkout.data.resolver.PaymentInfoState;
import app.chalo.checkout.data.resolver.PaymentInfoState$$serializer;
import app.chalo.features.checkout.CheckoutPaymentData;
import app.chalo.features.checkout.CheckoutPaymentData$$serializer;
import app.chalo.features.checkout.CheckoutProductData;
import app.chalo.features.checkout.CheckoutProductData$$serializer;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/checkout/ui/screen/payment/CheckoutRestoredState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/checkout/ui/screen/payment/CheckoutRestoredState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class CheckoutRestoredState$$serializer implements GeneratedSerializer<CheckoutRestoredState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CheckoutRestoredState$$serializer f1511a;
    private static final SerialDescriptor descriptor;

    static {
        CheckoutRestoredState$$serializer checkoutRestoredState$$serializer = new CheckoutRestoredState$$serializer();
        f1511a = checkoutRestoredState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.checkout.ui.screen.payment.CheckoutRestoredState", checkoutRestoredState$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("checkoutPaymentData", true);
        pluginGeneratedSerialDescriptor.j("checkoutProductData", true);
        pluginGeneratedSerialDescriptor.j("paymentInfoState", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.c(CheckoutPaymentData$$serializer.f2692a), BuiltinSerializersKt.c(CheckoutProductData$$serializer.f2696a), BuiltinSerializersKt.c(PaymentInfoState$$serializer.f1362a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        CheckoutPaymentData checkoutPaymentData;
        CheckoutProductData checkoutProductData;
        PaymentInfoState paymentInfoState;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        CheckoutPaymentData checkoutPaymentData2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            checkoutPaymentData = (CheckoutPaymentData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CheckoutPaymentData$$serializer.f2692a, null);
            checkoutProductData = (CheckoutProductData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CheckoutProductData$$serializer.f2696a, null);
            paymentInfoState = (PaymentInfoState) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, PaymentInfoState$$serializer.f1362a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            CheckoutProductData checkoutProductData2 = null;
            PaymentInfoState paymentInfoState2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    checkoutPaymentData2 = (CheckoutPaymentData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, CheckoutPaymentData$$serializer.f2692a, checkoutPaymentData2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    checkoutProductData2 = (CheckoutProductData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CheckoutProductData$$serializer.f2696a, checkoutProductData2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    paymentInfoState2 = (PaymentInfoState) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, PaymentInfoState$$serializer.f1362a, paymentInfoState2);
                    i2 |= 4;
                }
            }
            i = i2;
            checkoutPaymentData = checkoutPaymentData2;
            checkoutProductData = checkoutProductData2;
            paymentInfoState = paymentInfoState2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CheckoutRestoredState(i, checkoutPaymentData, checkoutProductData, paymentInfoState);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CheckoutRestoredState value = (CheckoutRestoredState) obj;
        Intrinsics.i(value, "value");
        PaymentInfoState paymentInfoState = value.c;
        CheckoutProductData checkoutProductData = value.b;
        CheckoutPaymentData checkoutPaymentData = value.f1510a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || checkoutPaymentData != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, CheckoutPaymentData$$serializer.f2692a, checkoutPaymentData);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || checkoutProductData != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, CheckoutProductData$$serializer.f2696a, checkoutProductData);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || paymentInfoState != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, PaymentInfoState$$serializer.f1362a, paymentInfoState);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
