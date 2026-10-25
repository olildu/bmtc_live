package app.chalo.kyc.min.ui.minkycotp;

import androidx.autofill.HintConstants;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/kyc/min/ui/minkycotp/MinKycOtpRestoredDataState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpRestoredDataState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MinKycOtpRestoredDataState$$serializer implements GeneratedSerializer<MinKycOtpRestoredDataState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MinKycOtpRestoredDataState$$serializer f4155a;
    private static final SerialDescriptor descriptor;

    static {
        MinKycOtpRestoredDataState$$serializer minKycOtpRestoredDataState$$serializer = new MinKycOtpRestoredDataState$$serializer();
        f4155a = minKycOtpRestoredDataState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.kyc.min.ui.minkycotp.MinKycOtpRestoredDataState", minKycOtpRestoredDataState$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("otpEntered", true);
        pluginGeneratedSerialDescriptor.j("otpLength", true);
        pluginGeneratedSerialDescriptor.j("kycErrorBottomSheetData", true);
        pluginGeneratedSerialDescriptor.j("isVerifyBtnEnabled", true);
        pluginGeneratedSerialDescriptor.j("remainingTimeInMillisForEnablingResend", true);
        pluginGeneratedSerialDescriptor.j("isResendBtnEnabled", true);
        pluginGeneratedSerialDescriptor.j("shouldShowInvalidOtpError", true);
        pluginGeneratedSerialDescriptor.j("otpFailureReason", true);
        pluginGeneratedSerialDescriptor.j(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, true);
        pluginGeneratedSerialDescriptor.j("refNo", true);
        pluginGeneratedSerialDescriptor.j("userName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = MinKycOtpRestoredDataState.l;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{stringSerializer, IntSerializer.f18146a, BuiltinSerializersKt.c(KycErrorBottomSheetData$$serializer.f4140a), booleanSerializer, LongSerializer.f18151a, booleanSerializer, booleanSerializer, lazyArr[7].getValue(), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        String str;
        String str2;
        OtpError otpError;
        KycErrorBottomSheetData kycErrorBottomSheetData;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        String str3;
        String strDecodeStringElement;
        long j;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MinKycOtpRestoredDataState.l;
        int i3 = 10;
        int i4 = 9;
        int i5 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            KycErrorBottomSheetData kycErrorBottomSheetData2 = (KycErrorBottomSheetData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, KycErrorBottomSheetData$$serializer.f4140a, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            OtpError otpError2 = (OtpError) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            otpError = otpError2;
            str3 = strDecodeStringElement2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            str2 = str5;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement2;
            z3 = zDecodeBooleanElement;
            str = str4;
            i = 2047;
            kycErrorBottomSheetData = kycErrorBottomSheetData2;
            i2 = iDecodeIntElement;
            j = jDecodeLongElement;
        } else {
            boolean z4 = true;
            boolean zDecodeBooleanElement4 = false;
            String str6 = null;
            String str7 = null;
            OtpError otpError3 = null;
            KycErrorBottomSheetData kycErrorBottomSheetData3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            long jDecodeLongElement2 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            int iDecodeIntElement2 = 0;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i3 = 10;
                        break;
                    case 0:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 1:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i5 |= 2;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 2:
                        kycErrorBottomSheetData3 = (KycErrorBottomSheetData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, KycErrorBottomSheetData$$serializer.f4140a, kycErrorBottomSheetData3);
                        i5 |= 4;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 3:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i5 |= 8;
                        i3 = 10;
                        break;
                    case 4:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i5 |= 16;
                        i3 = 10;
                        break;
                    case 5:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i5 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i5 |= 64;
                        break;
                    case 7:
                        otpError3 = (OtpError) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), otpError3);
                        i5 |= 128;
                        break;
                    case 8:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str6);
                        i5 |= 256;
                        break;
                    case 9:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.f18170a, str7);
                        i5 |= 512;
                        break;
                    case 10:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i5 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement4;
            str = str6;
            str2 = str7;
            otpError = otpError3;
            kycErrorBottomSheetData = kycErrorBottomSheetData3;
            i = i5;
            z2 = zDecodeBooleanElement5;
            z3 = zDecodeBooleanElement6;
            i2 = iDecodeIntElement2;
            str3 = strDecodeStringElement3;
            strDecodeStringElement = strDecodeStringElement4;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MinKycOtpRestoredDataState(i, i2, j, kycErrorBottomSheetData, otpError, str3, str, str2, strDecodeStringElement, z3, z2, z);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        MinKycOtpRestoredDataState value = (MinKycOtpRestoredDataState) obj;
        Intrinsics.i(value, "value");
        String str = value.k;
        String str2 = value.j;
        String str3 = value.i;
        OtpError otpError = value.h;
        boolean z = value.g;
        boolean z2 = value.f;
        long j = value.e;
        boolean z3 = value.d;
        KycErrorBottomSheetData kycErrorBottomSheetData = value.c;
        int i = value.b;
        String str4 = value.f4154a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MinKycOtpRestoredDataState.l;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.d(str4, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || i != 6) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || kycErrorBottomSheetData != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, KycErrorBottomSheetData$$serializer.f4140a, kycErrorBottomSheetData);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || j != 30000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || otpError != OtpError.INVALID_OTP) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), otpError);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.d(str, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 10, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
