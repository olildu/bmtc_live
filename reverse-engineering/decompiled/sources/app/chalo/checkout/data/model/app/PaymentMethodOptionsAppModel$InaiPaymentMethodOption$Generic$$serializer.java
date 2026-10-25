package app.chalo.checkout.data.model.app;

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
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Generic.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic$$serializer implements GeneratedSerializer<PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Generic> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic$$serializer f1302a;
    private static final SerialDescriptor descriptor;

    static {
        PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic$$serializer paymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic$$serializer = new PaymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic$$serializer();
        f1302a = paymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.checkout.data.model.app.PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Generic", paymentMethodOptionsAppModel$InaiPaymentMethodOption$Generic$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("methodDisplayDetails", false);
        pluginGeneratedSerialDescriptor.j("paymentMethodCode", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{PaymentDisplayDetailsAppModel$$serializer.f1290a, StringSerializer.f18170a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel;
        String strDecodeStringElement;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            paymentDisplayDetailsAppModel = (PaymentDisplayDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PaymentDisplayDetailsAppModel$$serializer.f1290a, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            String strDecodeStringElement2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    paymentDisplayDetailsAppModel2 = (PaymentDisplayDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PaymentDisplayDetailsAppModel$$serializer.f1290a, paymentDisplayDetailsAppModel2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i2 |= 2;
                }
            }
            i = i2;
            paymentDisplayDetailsAppModel = paymentDisplayDetailsAppModel2;
            strDecodeStringElement = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Generic(i, paymentDisplayDetailsAppModel, strDecodeStringElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Generic value = (PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Generic) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Generic.Companion companion = PaymentMethodOptionsAppModel.InaiPaymentMethodOption.Generic.INSTANCE;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, PaymentDisplayDetailsAppModel$$serializer.f1290a, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
