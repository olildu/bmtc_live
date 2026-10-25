package app.chalo.walletframework.quickpay.data.model.apimodel;

import app.chalo.receipt.ReceiptFareDataApiResponseModel;
import app.chalo.receipt.ReceiptFareDataApiResponseModel$$serializer;
import defpackage.vo1;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.Arrays;
import java.util.Map;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonNames;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/walletframework/quickpay/data/model/apimodel/QuickPayReceiptResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/walletframework/quickpay/data/model/apimodel/QuickPayReceiptResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class QuickPayReceiptResponseModel$$serializer implements GeneratedSerializer<QuickPayReceiptResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final QuickPayReceiptResponseModel$$serializer f10916a;
    private static final SerialDescriptor descriptor;

    static {
        QuickPayReceiptResponseModel$$serializer quickPayReceiptResponseModel$$serializer = new QuickPayReceiptResponseModel$$serializer();
        f10916a = quickPayReceiptResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.walletframework.quickpay.data.model.apimodel.QuickPayReceiptResponseModel", quickPayReceiptResponseModel$$serializer, 21);
        pluginGeneratedSerialDescriptor.j("transactionId", true);
        pluginGeneratedSerialDescriptor.j("punchTime", true);
        pluginGeneratedSerialDescriptor.j("activationDuration", true);
        pluginGeneratedSerialDescriptor.j("expiryTime", true);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.AMOUNT, true);
        pluginGeneratedSerialDescriptor.j("vehicleNo", true);
        pluginGeneratedSerialDescriptor.j("conductorId", true);
        pluginGeneratedSerialDescriptor.j("startStop", true);
        pluginGeneratedSerialDescriptor.j("endStop", true);
        pluginGeneratedSerialDescriptor.j("routeName", true);
        pluginGeneratedSerialDescriptor.j("passengerDetails", true);
        pluginGeneratedSerialDescriptor.j("via", false);
        pluginGeneratedSerialDescriptor.j("routeNamingSchemeType", false);
        pluginGeneratedSerialDescriptor.j("depotName", true);
        pluginGeneratedSerialDescriptor.j("etimGeneratedTicketId", true);
        final String[] strArr = {"printedTicketId"};
        pluginGeneratedSerialDescriptor.k(new JsonNames() { // from class: app.chalo.walletframework.quickpay.data.model.apimodel.QuickPayReceiptResponseModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return JsonNames.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof JsonNames) && Arrays.equals(strArr, ((JsonNames) obj).names());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return Arrays.hashCode(strArr) ^ 397397176;
            }

            @Override // kotlinx.serialization.json.JsonNames
            public final /* synthetic */ String[] names() {
                return strArr;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return vo1.B("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(strArr), ")");
            }
        });
        pluginGeneratedSerialDescriptor.j("scheduleNumber", true);
        pluginGeneratedSerialDescriptor.j("routeServiceType", true);
        final String[] strArr2 = {"serviceType"};
        pluginGeneratedSerialDescriptor.k(new JsonNames() { // from class: app.chalo.walletframework.quickpay.data.model.apimodel.QuickPayReceiptResponseModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return JsonNames.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof JsonNames) && Arrays.equals(strArr2, ((JsonNames) obj).names());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return Arrays.hashCode(strArr2) ^ 397397176;
            }

            @Override // kotlinx.serialization.json.JsonNames
            public final /* synthetic */ String[] names() {
                return strArr2;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return vo1.B("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(strArr2), ")");
            }
        });
        pluginGeneratedSerialDescriptor.j("driverId", true);
        pluginGeneratedSerialDescriptor.j("waybillNo", true);
        final String[] strArr3 = {"wayBillNo"};
        pluginGeneratedSerialDescriptor.k(new JsonNames() { // from class: app.chalo.walletframework.quickpay.data.model.apimodel.QuickPayReceiptResponseModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return JsonNames.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof JsonNames) && Arrays.equals(strArr3, ((JsonNames) obj).names());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return Arrays.hashCode(strArr3) ^ 397397176;
            }

            @Override // kotlinx.serialization.json.JsonNames
            public final /* synthetic */ String[] names() {
                return strArr3;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return vo1.B("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(strArr3), ")");
            }
        });
        pluginGeneratedSerialDescriptor.j("etimVersion", true);
        final String[] strArr4 = {"version"};
        pluginGeneratedSerialDescriptor.k(new JsonNames() { // from class: app.chalo.walletframework.quickpay.data.model.apimodel.QuickPayReceiptResponseModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return JsonNames.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof JsonNames) && Arrays.equals(strArr4, ((JsonNames) obj).names());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return Arrays.hashCode(strArr4) ^ 397397176;
            }

            @Override // kotlinx.serialization.json.JsonNames
            public final /* synthetic */ String[] names() {
                return strArr4;
            }

            @Override // java.lang.annotation.Annotation
            public final String toString() {
                return vo1.B("@kotlinx.serialization.json.JsonNames(names=", Arrays.toString(strArr4), ")");
            }
        });
        pluginGeneratedSerialDescriptor.j("ticketFareData", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = QuickPayReceiptResponseModel.v;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c((KSerializer) lazyArr[10].getValue());
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC8 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC9 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC10 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC11 = BuiltinSerializersKt.c(ReceiptFareDataApiResponseModel$$serializer.f8922a);
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{stringSerializer, longSerializer, longSerializer, longSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, kSerializerC9, kSerializerC10, kSerializerC11};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel;
        String str6;
        Map map;
        String str7;
        String str8;
        String str9;
        long j;
        long j2;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        long j3;
        long j4;
        String str15;
        int i2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = QuickPayReceiptResponseModel.v;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, null);
            receiptFareDataApiResponseModel = (ReceiptFareDataApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, ReceiptFareDataApiResponseModel$$serializer.f8922a, null);
            str15 = strDecodeStringElement2;
            str10 = strDecodeStringElement3;
            j = jDecodeLongElement4;
            str13 = strDecodeStringElement6;
            str11 = strDecodeStringElement4;
            i = 2097151;
            j2 = jDecodeLongElement;
            str14 = strDecodeStringElement7;
            str12 = strDecodeStringElement5;
            str6 = str16;
            str7 = str24;
            str4 = str23;
            str8 = str22;
            str9 = str21;
            str = str20;
            str3 = str19;
            str2 = str18;
            str5 = str17;
            map = map2;
            j3 = jDecodeLongElement2;
            j4 = jDecodeLongElement3;
        } else {
            long jDecodeLongElement5 = 0;
            boolean z = true;
            int i3 = 0;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel2 = null;
            String str30 = null;
            Map map3 = null;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            long jDecodeLongElement6 = 0;
            long jDecodeLongElement7 = 0;
            long jDecodeLongElement8 = 0;
            while (z) {
                lazyArr = lazyArr;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i3 |= 1;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        break;
                    case 1:
                        strDecodeStringElement = strDecodeStringElement;
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i3 |= 2;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 2:
                        strDecodeStringElement = strDecodeStringElement;
                        jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i3 |= 4;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 3:
                        strDecodeStringElement = strDecodeStringElement;
                        jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i3 |= 8;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 4:
                        strDecodeStringElement = strDecodeStringElement;
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i3 |= 16;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 5:
                        strDecodeStringElement = strDecodeStringElement;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 6:
                        strDecodeStringElement = strDecodeStringElement;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 7:
                        strDecodeStringElement = strDecodeStringElement;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 8:
                        strDecodeStringElement = strDecodeStringElement;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 |= 256;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 9:
                        strDecodeStringElement = strDecodeStringElement;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 |= 512;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 10:
                        strDecodeStringElement = strDecodeStringElement;
                        map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), map3);
                        i3 |= 1024;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 11:
                        strDecodeStringElement = strDecodeStringElement;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str30);
                        i3 |= 2048;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 12:
                        strDecodeStringElement = strDecodeStringElement;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str29);
                        i3 |= 4096;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 13:
                        strDecodeStringElement = strDecodeStringElement;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str26);
                        i3 |= 8192;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 14:
                        strDecodeStringElement = strDecodeStringElement;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str27);
                        i3 |= 16384;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 15:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str25);
                        i2 = 32768;
                        i3 |= i2;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 16:
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str33);
                        i2 = 65536;
                        i3 |= i2;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 17:
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str32);
                        i2 = 131072;
                        i3 |= i2;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 18:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str28);
                        i2 = 262144;
                        i3 |= i2;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 19:
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.f18170a, str31);
                        i2 = 524288;
                        i3 |= i2;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    case 20:
                        receiptFareDataApiResponseModel2 = (ReceiptFareDataApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, ReceiptFareDataApiResponseModel$$serializer.f8922a, receiptFareDataApiResponseModel2);
                        i2 = 1048576;
                        i3 |= i2;
                        strDecodeStringElement = strDecodeStringElement;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = str25;
            str2 = str26;
            str3 = str27;
            str4 = str28;
            str5 = str29;
            receiptFareDataApiResponseModel = receiptFareDataApiResponseModel2;
            str6 = str30;
            map = map3;
            str7 = str31;
            str8 = str32;
            str9 = str33;
            j = jDecodeLongElement5;
            j2 = jDecodeLongElement6;
            str10 = strDecodeStringElement8;
            str11 = strDecodeStringElement9;
            str12 = strDecodeStringElement10;
            str13 = strDecodeStringElement11;
            str14 = strDecodeStringElement12;
            j3 = jDecodeLongElement7;
            j4 = jDecodeLongElement8;
            str15 = strDecodeStringElement;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new QuickPayReceiptResponseModel(i, str15, j2, j3, j4, j, str10, str11, str12, str13, str14, map, str6, str5, str2, str3, str, str9, str8, str4, str7, receiptFareDataApiResponseModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x018e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0191 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x01a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x0105  */
    /* JADX WARN: Code duplicated, block: B:72:0x0135 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0145  */
    /* JADX WARN: Code duplicated, block: B:82:0x0151 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x0153  */
    /* JADX WARN: Code duplicated, block: B:87:0x015f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0161  */
    /* JADX WARN: Code duplicated, block: B:91:0x016c  */
    /* JADX WARN: Code duplicated, block: B:92:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x017d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0180 A[ADDED_TO_REGION] */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        String str;
        String str2;
        StringSerializer stringSerializer;
        String str3;
        String str4;
        String str5;
        String str6;
        QuickPayReceiptResponseModel value = (QuickPayReceiptResponseModel) obj;
        Intrinsics.i(value, "value");
        ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel = value.u;
        String str7 = value.t;
        String str8 = value.s;
        String str9 = value.r;
        Map map = value.k;
        String str10 = value.j;
        String str11 = value.i;
        String str12 = value.h;
        String str13 = value.g;
        String str14 = value.f;
        long j = value.e;
        long j2 = value.d;
        long j3 = value.c;
        long j4 = value.b;
        String str15 = value.f10915a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = QuickPayReceiptResponseModel.v;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.d(str15, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str15);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || j4 != -1) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, j4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || j3 != 0) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, j3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || j2 != -1) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, j2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || j != 0) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.d(str14, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, str14);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.d(str13, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, str13);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.d(str12, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, str12);
        }
        if (!compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8)) {
            str = str11;
            if (!Intrinsics.d(str, "")) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9)) {
                str2 = str10;
                if (!Intrinsics.d(str2, "")) {
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || map != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), map);
                }
                stringSerializer = StringSerializer.f18170a;
                String str16 = value.l;
                str3 = value.q;
                str4 = value.p;
                str5 = value.o;
                str6 = value.n;
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, str16);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, value.m);
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || str6 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, str6);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || str5 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, str5);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || str4 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, str4);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16) || str3 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, str3);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17) || str9 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, str9);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18) || str8 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, str8);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19) || str7 != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, str7);
                }
                if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20) || receiptFareDataApiResponseModel != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, ReceiptFareDataApiResponseModel$$serializer.f8922a, receiptFareDataApiResponseModel);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
            str2 = str10;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, str2);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), map);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), map);
            }
            stringSerializer = StringSerializer.f18170a;
            String str17 = value.l;
            str3 = value.q;
            str4 = value.p;
            str5 = value.o;
            str6 = value.n;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, str17);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, value.m);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, str6);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, str6);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, str5);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, str5);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, str4);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, str4);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, str3);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, str3);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, str9);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, str9);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, str8);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, str8);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, str7);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, str7);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, ReceiptFareDataApiResponseModel$$serializer.f8922a, receiptFareDataApiResponseModel);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, ReceiptFareDataApiResponseModel$$serializer.f8922a, receiptFareDataApiResponseModel);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        str = str11;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, str);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9)) {
            str2 = str10;
            if (!Intrinsics.d(str2, "")) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), map);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), map);
            }
            stringSerializer = StringSerializer.f18170a;
            String str18 = value.l;
            str3 = value.q;
            str4 = value.p;
            str5 = value.o;
            str6 = value.n;
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, str18);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, value.m);
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, str6);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, str6);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, str5);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, str5);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, str4);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, str4);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, str3);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, str3);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, str9);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, str9);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, str8);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, str8);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, str7);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, str7);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, ReceiptFareDataApiResponseModel$$serializer.f8922a, receiptFareDataApiResponseModel);
            } else {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, ReceiptFareDataApiResponseModel$$serializer.f8922a, receiptFareDataApiResponseModel);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        str2 = str10;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, str2);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), map);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), map);
        }
        stringSerializer = StringSerializer.f18170a;
        String str19 = value.l;
        str3 = value.q;
        str4 = value.p;
        str5 = value.o;
        str6 = value.n;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, str19);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, value.m);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, str6);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, str6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, str5);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, str4);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, str3);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, str9);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, str9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, str8);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, str8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, str7);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, str7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, ReceiptFareDataApiResponseModel$$serializer.f8922a, receiptFareDataApiResponseModel);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, ReceiptFareDataApiResponseModel$$serializer.f8922a, receiptFareDataApiResponseModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
