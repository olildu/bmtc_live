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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/kyc/min/ui/minkycotp/MinKycOtpDataState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/kyc/min/ui/minkycotp/MinKycOtpDataState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class MinKycOtpDataState$$serializer implements GeneratedSerializer<MinKycOtpDataState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MinKycOtpDataState$$serializer f4146a;
    private static final SerialDescriptor descriptor;

    static {
        MinKycOtpDataState$$serializer minKycOtpDataState$$serializer = new MinKycOtpDataState$$serializer();
        f4146a = minKycOtpDataState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.kyc.min.ui.minkycotp.MinKycOtpDataState", minKycOtpDataState$$serializer, 14);
        pluginGeneratedSerialDescriptor.j("otpEntered", true);
        pluginGeneratedSerialDescriptor.j("otpLength", true);
        pluginGeneratedSerialDescriptor.j("kycErrorBottomSheetData", true);
        pluginGeneratedSerialDescriptor.j("loadingPurpose", true);
        pluginGeneratedSerialDescriptor.j("isLoading", true);
        pluginGeneratedSerialDescriptor.j("isVerifyBtnEnabled", true);
        pluginGeneratedSerialDescriptor.j("remainingTimeInMillisForEnablingResend", true);
        pluginGeneratedSerialDescriptor.j("isResendBtnEnabled", true);
        pluginGeneratedSerialDescriptor.j("shouldShowInvalidOtpError", true);
        pluginGeneratedSerialDescriptor.j("otpFailureReason", true);
        pluginGeneratedSerialDescriptor.j(HintConstants.AUTOFILL_HINT_PHONE_NUMBER, true);
        pluginGeneratedSerialDescriptor.j("refNo", true);
        pluginGeneratedSerialDescriptor.j("bottomSheetType", true);
        pluginGeneratedSerialDescriptor.j("userName", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = MinKycOtpDataState.o;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{stringSerializer, IntSerializer.f18146a, BuiltinSerializersKt.c(KycErrorBottomSheetData$$serializer.f4140a), lazyArr[3].getValue(), booleanSerializer, booleanSerializer, LongSerializer.f18151a, booleanSerializer, booleanSerializer, lazyArr[9].getValue(), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), lazyArr[12].getValue(), stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        KycLoadingPurpose kycLoadingPurpose;
        int i;
        int i2;
        MinKycScreenBottomSheetType minKycScreenBottomSheetType;
        String str;
        OtpError otpError;
        KycErrorBottomSheetData kycErrorBottomSheetData;
        String str2;
        String str3;
        String strDecodeStringElement;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MinKycOtpDataState.o;
        int i3 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            KycErrorBottomSheetData kycErrorBottomSheetData2 = (KycErrorBottomSheetData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, KycErrorBottomSheetData$$serializer.f4140a, null);
            KycLoadingPurpose kycLoadingPurpose2 = (KycLoadingPurpose) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            OtpError otpError2 = (OtpError) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            minKycScreenBottomSheetType = (MinKycScreenBottomSheetType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), null);
            str3 = strDecodeStringElement2;
            i = iDecodeIntElement;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            str2 = str4;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement4;
            z3 = zDecodeBooleanElement2;
            otpError = otpError2;
            z4 = zDecodeBooleanElement;
            kycErrorBottomSheetData = kycErrorBottomSheetData2;
            kycLoadingPurpose = kycLoadingPurpose2;
            str = str5;
            i2 = 16383;
            j = jDecodeLongElement;
        } else {
            int i4 = 13;
            boolean z5 = true;
            KycLoadingPurpose kycLoadingPurpose3 = null;
            MinKycScreenBottomSheetType minKycScreenBottomSheetType2 = null;
            String str6 = null;
            OtpError otpError3 = null;
            String strDecodeStringElement3 = null;
            int i5 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            boolean zDecodeBooleanElement8 = false;
            int i6 = 3;
            long jDecodeLongElement2 = 0;
            KycErrorBottomSheetData kycErrorBottomSheetData3 = null;
            String str7 = null;
            String strDecodeStringElement4 = null;
            int iDecodeIntElement2 = 0;
            while (z5) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z5 = false;
                        i4 = 13;
                        i6 = 3;
                        break;
                    case 0:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 13;
                        i3 = 10;
                        i6 = 3;
                        break;
                    case 1:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 13;
                        i3 = 10;
                        i6 = 3;
                        break;
                    case 2:
                        kycErrorBottomSheetData3 = (KycErrorBottomSheetData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, KycErrorBottomSheetData$$serializer.f4140a, kycErrorBottomSheetData3);
                        i5 |= 4;
                        i4 = 13;
                        i3 = 10;
                        i6 = 3;
                        break;
                    case 3:
                        kycLoadingPurpose3 = (KycLoadingPurpose) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i6].getValue(), kycLoadingPurpose3);
                        i5 |= 8;
                        i4 = 13;
                        i3 = 10;
                        break;
                    case 4:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i5 |= 16;
                        i4 = 13;
                        break;
                    case 5:
                        zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i5 |= 32;
                        i4 = 13;
                        break;
                    case 6:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 6);
                        i5 |= 64;
                        i4 = 13;
                        break;
                    case 7:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i5 |= 128;
                        i4 = 13;
                        break;
                    case 8:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i5 |= 256;
                        i4 = 13;
                        break;
                    case 9:
                        otpError3 = (OtpError) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), otpError3);
                        i5 |= 512;
                        i4 = 13;
                        break;
                    case 10:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.f18170a, str7);
                        i5 |= 1024;
                        i4 = 13;
                        break;
                    case 11:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str6);
                        i5 |= 2048;
                        i4 = 13;
                        break;
                    case 12:
                        minKycScreenBottomSheetType2 = (MinKycScreenBottomSheetType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), minKycScreenBottomSheetType2);
                        i5 |= 4096;
                        i4 = 13;
                        break;
                    case 13:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i5 |= 8192;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            kycLoadingPurpose = kycLoadingPurpose3;
            i = iDecodeIntElement2;
            i2 = i5;
            minKycScreenBottomSheetType = minKycScreenBottomSheetType2;
            str = str6;
            otpError = otpError3;
            kycErrorBottomSheetData = kycErrorBottomSheetData3;
            str2 = str7;
            str3 = strDecodeStringElement4;
            strDecodeStringElement = strDecodeStringElement3;
            z = zDecodeBooleanElement5;
            z2 = zDecodeBooleanElement6;
            z3 = zDecodeBooleanElement7;
            z4 = zDecodeBooleanElement8;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MinKycOtpDataState(i2, str3, i, kycErrorBottomSheetData, kycLoadingPurpose, z4, z3, j, z, z2, otpError, str2, str, minKycScreenBottomSheetType, strDecodeStringElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0125  */
    /* JADX WARN: Code duplicated, block: B:78:0x0128  */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        MinKycScreenBottomSheetType minKycScreenBottomSheetType;
        String str;
        MinKycOtpDataState value = (MinKycOtpDataState) obj;
        Intrinsics.i(value, "value");
        String str2 = value.n;
        MinKycScreenBottomSheetType minKycScreenBottomSheetType2 = value.m;
        String str3 = value.l;
        String str4 = value.k;
        OtpError otpError = value.j;
        boolean z = value.i;
        boolean z2 = value.h;
        long j = value.g;
        boolean z3 = value.f;
        boolean z4 = value.e;
        KycLoadingPurpose kycLoadingPurpose = value.d;
        KycErrorBottomSheetData kycErrorBottomSheetData = value.c;
        int i = value.b;
        String str5 = value.f4145a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = MinKycOtpDataState.o;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.d(str5, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || i != 6) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || kycErrorBottomSheetData != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, KycErrorBottomSheetData$$serializer.f4140a, kycErrorBottomSheetData);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || kycLoadingPurpose != KycLoadingPurpose.GENERAL) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), kycLoadingPurpose);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || z4) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, z4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || j != 30000) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 6, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || otpError != OtpError.INVALID_OTP) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), otpError);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str3);
        }
        if (!compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12)) {
            minKycScreenBottomSheetType = minKycScreenBottomSheetType2;
            if (minKycScreenBottomSheetType != MinKycScreenBottomSheetType.NONE) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13)) {
                str = str2;
                if (!Intrinsics.d(str, "")) {
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            str = str2;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 13, str);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        minKycScreenBottomSheetType = minKycScreenBottomSheetType2;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 12, (SerializationStrategy) lazyArr[12].getValue(), minKycScreenBottomSheetType);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13)) {
            str = str2;
            if (!Intrinsics.d(str, "")) {
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        str = str2;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 13, str);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
