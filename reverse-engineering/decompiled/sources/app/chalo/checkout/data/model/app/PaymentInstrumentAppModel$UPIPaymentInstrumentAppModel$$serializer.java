package app.chalo.checkout.data.model.app;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/checkout/data/model/app/PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/checkout/data/model/app/PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel$$serializer implements GeneratedSerializer<PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel$$serializer f1293a;
    private static final SerialDescriptor descriptor;

    static {
        PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel$$serializer paymentInstrumentAppModel$UPIPaymentInstrumentAppModel$$serializer = new PaymentInstrumentAppModel$UPIPaymentInstrumentAppModel$$serializer();
        f1293a = paymentInstrumentAppModel$UPIPaymentInstrumentAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.checkout.data.model.app.PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel", paymentInstrumentAppModel$UPIPaymentInstrumentAppModel$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("instrumentDisplayDetails", false);
        pluginGeneratedSerialDescriptor.j("displayDetails", false);
        pluginGeneratedSerialDescriptor.j(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, false);
        pluginGeneratedSerialDescriptor.j("hasNativeInstalledAppIcon", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        PaymentDisplayDetailsAppModel$$serializer paymentDisplayDetailsAppModel$$serializer = PaymentDisplayDetailsAppModel$$serializer.f1290a;
        return new KSerializer[]{paymentDisplayDetailsAppModel$$serializer, paymentDisplayDetailsAppModel$$serializer, StringSerializer.f18170a, BooleanSerializer.f18123a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel;
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel2;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            PaymentDisplayDetailsAppModel$$serializer paymentDisplayDetailsAppModel$$serializer = PaymentDisplayDetailsAppModel$$serializer.f1290a;
            PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel3 = (PaymentDisplayDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, paymentDisplayDetailsAppModel$$serializer, null);
            PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel4 = (PaymentDisplayDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, paymentDisplayDetailsAppModel$$serializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            paymentDisplayDetailsAppModel2 = paymentDisplayDetailsAppModel4;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            str = strDecodeStringElement;
            i = 15;
            paymentDisplayDetailsAppModel = paymentDisplayDetailsAppModel3;
        } else {
            boolean z = true;
            boolean zDecodeBooleanElement2 = false;
            PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel5 = null;
            PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel6 = null;
            String strDecodeStringElement2 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    paymentDisplayDetailsAppModel5 = (PaymentDisplayDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PaymentDisplayDetailsAppModel$$serializer.f1290a, paymentDisplayDetailsAppModel5);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    paymentDisplayDetailsAppModel6 = (PaymentDisplayDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, PaymentDisplayDetailsAppModel$$serializer.f1290a, paymentDisplayDetailsAppModel6);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                    i2 |= 8;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i = i2;
            paymentDisplayDetailsAppModel = paymentDisplayDetailsAppModel5;
            paymentDisplayDetailsAppModel2 = paymentDisplayDetailsAppModel6;
            str = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel(i, paymentDisplayDetailsAppModel, paymentDisplayDetailsAppModel2, str, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel value = (PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel.Companion companion = PaymentInstrumentAppModel.UPIPaymentInstrumentAppModel.INSTANCE;
        PaymentDisplayDetailsAppModel$$serializer paymentDisplayDetailsAppModel$$serializer = PaymentDisplayDetailsAppModel$$serializer.f1290a;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, paymentDisplayDetailsAppModel$$serializer, value.f1291a);
        PaymentDisplayDetailsAppModel paymentDisplayDetailsAppModel = value.c;
        boolean z = value.e;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, paymentDisplayDetailsAppModel$$serializer, paymentDisplayDetailsAppModel);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
