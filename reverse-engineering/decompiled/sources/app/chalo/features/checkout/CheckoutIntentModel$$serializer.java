package app.chalo.features.checkout;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/features/checkout/CheckoutIntentModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/features/checkout/CheckoutIntentModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class CheckoutIntentModel$$serializer implements GeneratedSerializer<CheckoutIntentModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CheckoutIntentModel$$serializer f2686a;
    private static final SerialDescriptor descriptor;

    static {
        CheckoutIntentModel$$serializer checkoutIntentModel$$serializer = new CheckoutIntentModel$$serializer();
        f2686a = checkoutIntentModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.features.checkout.CheckoutIntentModel", checkoutIntentModel$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("paymentData", false);
        pluginGeneratedSerialDescriptor.j("productData", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{CheckoutPaymentData$$serializer.f2692a, CheckoutProductData$$serializer.f2696a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        CheckoutPaymentData checkoutPaymentData;
        CheckoutProductData checkoutProductData;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        CheckoutPaymentData checkoutPaymentData2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            checkoutPaymentData = (CheckoutPaymentData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, CheckoutPaymentData$$serializer.f2692a, null);
            checkoutProductData = (CheckoutProductData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, CheckoutProductData$$serializer.f2696a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            CheckoutProductData checkoutProductData2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    checkoutPaymentData2 = (CheckoutPaymentData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, CheckoutPaymentData$$serializer.f2692a, checkoutPaymentData2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    checkoutProductData2 = (CheckoutProductData) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, CheckoutProductData$$serializer.f2696a, checkoutProductData2);
                    i2 |= 2;
                }
            }
            i = i2;
            checkoutPaymentData = checkoutPaymentData2;
            checkoutProductData = checkoutProductData2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CheckoutIntentModel(i, checkoutPaymentData, checkoutProductData);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        CheckoutIntentModel value = (CheckoutIntentModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, CheckoutPaymentData$$serializer.f2692a, value.f2685a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, CheckoutProductData$$serializer.f2696a, value.b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
