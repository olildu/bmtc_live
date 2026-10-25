package app.chalo.checkout.data.resolver;

import app.chalo.checkout.data.model.app.PaymentMethodsAppModel;
import app.chalo.checkout.data.model.app.PaymentMethodsAppModel$$serializer;
import app.chalo.checkout.data.model.app.SelectedPaymentInstrumentData;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/checkout/data/resolver/PaymentInfoState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/checkout/data/resolver/PaymentInfoState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PaymentInfoState$$serializer implements GeneratedSerializer<PaymentInfoState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PaymentInfoState$$serializer f1362a;
    private static final SerialDescriptor descriptor;

    static {
        PaymentInfoState$$serializer paymentInfoState$$serializer = new PaymentInfoState$$serializer();
        f1362a = paymentInfoState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.checkout.data.resolver.PaymentInfoState", paymentInfoState$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("paymentMethodsData", false);
        pluginGeneratedSerialDescriptor.j("paymentAppName", true);
        pluginGeneratedSerialDescriptor.j("selectedCheckoutPaymentMethodCode", true);
        pluginGeneratedSerialDescriptor.j("selectedPaymentInstrumentData", true);
        pluginGeneratedSerialDescriptor.j("isChaloPaySelectedFromWalletScreen", true);
        pluginGeneratedSerialDescriptor.j("freshSelectedPaymentMethodDataReceived", true);
        pluginGeneratedSerialDescriptor.j("lazyPayUrl", true);
        pluginGeneratedSerialDescriptor.j("paymentTransactionId", true);
        pluginGeneratedSerialDescriptor.j("isPaymentInitiated", true);
        pluginGeneratedSerialDescriptor.j("customPaymentUrlStatus", true);
        pluginGeneratedSerialDescriptor.j("juspayPaymentDetails", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PaymentInfoState.l;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{PaymentMethodsAppModel$$serializer.f1318a, BuiltinSerializersKt.c(stringSerializer), stringSerializer, BuiltinSerializersKt.c((KSerializer) lazyArr[3].getValue()), booleanSerializer, booleanSerializer, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), booleanSerializer, lazyArr[9].getValue(), JusPayPaymentDetails$$serializer.f1358a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        boolean z2;
        String str;
        JusPayPaymentDetails jusPayPaymentDetails;
        PaymentMethodsAppModel paymentMethodsAppModel;
        CustomUrlPaymentStatus customUrlPaymentStatus;
        String str2;
        String str3;
        SelectedPaymentInstrumentData selectedPaymentInstrumentData;
        int i;
        boolean z3;
        String str4;
        char c;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PaymentInfoState.l;
        int i2 = 8;
        int i3 = 9;
        int i4 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            PaymentMethodsAppModel paymentMethodsAppModel2 = (PaymentMethodsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PaymentMethodsAppModel$$serializer.f1318a, null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            SelectedPaymentInstrumentData selectedPaymentInstrumentData2 = (SelectedPaymentInstrumentData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            customUrlPaymentStatus = (CustomUrlPaymentStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            paymentMethodsAppModel = paymentMethodsAppModel2;
            selectedPaymentInstrumentData = selectedPaymentInstrumentData2;
            str3 = str7;
            str2 = str6;
            z = zDecodeBooleanElement2;
            z2 = zDecodeBooleanElement3;
            z3 = zDecodeBooleanElement;
            str4 = strDecodeStringElement;
            jusPayPaymentDetails = (JusPayPaymentDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, JusPayPaymentDetails$$serializer.f1358a, null);
            i = 2047;
            str = str5;
        } else {
            int i5 = 3;
            boolean z4 = true;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            JusPayPaymentDetails jusPayPaymentDetails2 = null;
            CustomUrlPaymentStatus customUrlPaymentStatus2 = null;
            String str8 = null;
            String str9 = null;
            SelectedPaymentInstrumentData selectedPaymentInstrumentData3 = null;
            PaymentMethodsAppModel paymentMethodsAppModel3 = null;
            String str10 = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement6 = false;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i2 = 8;
                        i3 = 9;
                        i5 = 3;
                        break;
                    case 0:
                        paymentMethodsAppModel3 = (PaymentMethodsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, PaymentMethodsAppModel$$serializer.f1318a, paymentMethodsAppModel3);
                        i4 |= 1;
                        i2 = 8;
                        i3 = 9;
                        i5 = 3;
                        break;
                    case 1:
                        i4 |= 2;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str10);
                        i2 = 8;
                        i5 = 3;
                        break;
                    case 2:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        selectedPaymentInstrumentData3 = (SelectedPaymentInstrumentData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), selectedPaymentInstrumentData3);
                        i4 |= 8;
                        break;
                    case 4:
                        i4 |= 16;
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        break;
                    case 5:
                        c = 6;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i4 |= 32;
                        break;
                    case 6:
                        c = 6;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str8);
                        i4 |= 64;
                        break;
                    case 7:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str9);
                        i4 |= 128;
                        break;
                    case 8:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i4 |= 256;
                        break;
                    case 9:
                        customUrlPaymentStatus2 = (CustomUrlPaymentStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), customUrlPaymentStatus2);
                        i4 |= 512;
                        break;
                    case 10:
                        jusPayPaymentDetails2 = (JusPayPaymentDetails) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, JusPayPaymentDetails$$serializer.f1358a, jusPayPaymentDetails2);
                        i4 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement4;
            z2 = zDecodeBooleanElement5;
            str = str10;
            jusPayPaymentDetails = jusPayPaymentDetails2;
            paymentMethodsAppModel = paymentMethodsAppModel3;
            customUrlPaymentStatus = customUrlPaymentStatus2;
            str2 = str8;
            str3 = str9;
            selectedPaymentInstrumentData = selectedPaymentInstrumentData3;
            i = i4;
            z3 = zDecodeBooleanElement6;
            str4 = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PaymentInfoState(i, paymentMethodsAppModel, str, str4, selectedPaymentInstrumentData, z3, z, str2, str3, z2, customUrlPaymentStatus, jusPayPaymentDetails);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PaymentInfoState value = (PaymentInfoState) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PaymentInfoState.l;
        PaymentMethodsAppModel$$serializer paymentMethodsAppModel$$serializer = PaymentMethodsAppModel$$serializer.f1318a;
        PaymentMethodsAppModel paymentMethodsAppModel = value.f1361a;
        JusPayPaymentDetails jusPayPaymentDetails = value.k;
        CustomUrlPaymentStatus customUrlPaymentStatus = value.j;
        boolean z = value.i;
        String str = value.h;
        String str2 = value.g;
        boolean z2 = value.f;
        boolean z3 = value.e;
        SelectedPaymentInstrumentData selectedPaymentInstrumentData = value.d;
        String str3 = value.c;
        String str4 = value.b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, paymentMethodsAppModel$$serializer, paymentMethodsAppModel);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.d(str3, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || selectedPaymentInstrumentData != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), selectedPaymentInstrumentData);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || customUrlPaymentStatus != CustomUrlPaymentStatus.NONE) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), customUrlPaymentStatus);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.d(jusPayPaymentDetails, new JusPayPaymentDetails())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, JusPayPaymentDetails$$serializer.f1358a, jusPayPaymentDetails);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
