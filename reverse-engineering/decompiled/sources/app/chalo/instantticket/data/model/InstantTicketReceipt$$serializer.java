package app.chalo.instantticket.data.model;

import app.chalo.providers.RouteNamingSchemeType;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/instantticket/data/model/InstantTicketReceipt.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/instantticket/data/model/InstantTicketReceipt;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class InstantTicketReceipt$$serializer implements GeneratedSerializer<InstantTicketReceipt> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InstantTicketReceipt$$serializer f3844a;
    private static final SerialDescriptor descriptor;

    static {
        InstantTicketReceipt$$serializer instantTicketReceipt$$serializer = new InstantTicketReceipt$$serializer();
        f3844a = instantTicketReceipt$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.instantticket.data.model.InstantTicketReceipt", instantTicketReceipt$$serializer, 20);
        pluginGeneratedSerialDescriptor.j("bookingId", true);
        pluginGeneratedSerialDescriptor.j("punchTime", true);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.AMOUNT, true);
        pluginGeneratedSerialDescriptor.j("vehicleNo", true);
        pluginGeneratedSerialDescriptor.j("conductorId", true);
        pluginGeneratedSerialDescriptor.j("startStopName", true);
        pluginGeneratedSerialDescriptor.j("endStopName", true);
        pluginGeneratedSerialDescriptor.j("endStopId", true);
        pluginGeneratedSerialDescriptor.j("routeName", true);
        pluginGeneratedSerialDescriptor.j("productReceiptPassengerDetails", true);
        pluginGeneratedSerialDescriptor.j("via", true);
        pluginGeneratedSerialDescriptor.j("routeNamingScheme", true);
        pluginGeneratedSerialDescriptor.j("depotName", true);
        pluginGeneratedSerialDescriptor.j("etimGeneratedTicketId", true);
        final String[] strArr = {"printedTicketId"};
        pluginGeneratedSerialDescriptor.k(new JsonNames() { // from class: app.chalo.instantticket.data.model.InstantTicketReceipt$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0
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
        pluginGeneratedSerialDescriptor.k(new JsonNames() { // from class: app.chalo.instantticket.data.model.InstantTicketReceipt$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0
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
        pluginGeneratedSerialDescriptor.j("etimVersion", true);
        final String[] strArr3 = {"version"};
        pluginGeneratedSerialDescriptor.k(new JsonNames() { // from class: app.chalo.instantticket.data.model.InstantTicketReceipt$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0
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
        pluginGeneratedSerialDescriptor.j("ticketFareData", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = InstantTicketReceipt.u;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{stringSerializer, longSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.c((KSerializer) lazyArr[9].getValue()), BuiltinSerializersKt.c(stringSerializer), lazyArr[11].getValue(), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(ReceiptFareDataApiResponseModel$$serializer.f8922a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        RouteNamingSchemeType routeNamingSchemeType;
        String str;
        String str2;
        String str3;
        String str4;
        Map map;
        ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        long j;
        long j2;
        String str15;
        int i2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = InstantTicketReceipt.u;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            RouteNamingSchemeType routeNamingSchemeType2 = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            i = 1048575;
            receiptFareDataApiResponseModel = (ReceiptFareDataApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, ReceiptFareDataApiResponseModel$$serializer.f8922a, null);
            str8 = str17;
            str9 = strDecodeStringElement2;
            str14 = strDecodeStringElement7;
            str10 = strDecodeStringElement3;
            map = map2;
            j = jDecodeLongElement;
            str4 = str16;
            str13 = strDecodeStringElement6;
            str12 = strDecodeStringElement5;
            str11 = strDecodeStringElement4;
            str3 = str23;
            str = str22;
            str5 = str21;
            str6 = str20;
            str7 = str19;
            str2 = str18;
            routeNamingSchemeType = routeNamingSchemeType2;
            j2 = jDecodeLongElement2;
            str15 = strDecodeStringElement;
        } else {
            String strDecodeStringElement8 = null;
            RouteNamingSchemeType routeNamingSchemeType3 = null;
            String str24 = null;
            String str25 = null;
            ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel2 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            int i3 = 9;
            boolean z = true;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            String str30 = null;
            String str31 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            i = 0;
            Map map3 = null;
            while (z) {
                lazyArr = lazyArr;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 9;
                        break;
                    case 0:
                        i |= 1;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 = 9;
                        break;
                    case 1:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 1);
                        i |= 2;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        i3 = 9;
                        break;
                    case 2:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i |= 4;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        i3 = 9;
                        break;
                    case 3:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        i3 = 9;
                        break;
                    case 4:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        i3 = 9;
                        break;
                    case 5:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        i3 = 9;
                        break;
                    case 6:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        i3 = 9;
                        break;
                    case 7:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        i3 = 9;
                        break;
                    case 8:
                        strDecodeStringElement8 = strDecodeStringElement8;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i |= 256;
                        lazyArr = lazyArr;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        break;
                    case 9:
                        strDecodeStringElement8 = strDecodeStringElement8;
                        map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), map3);
                        i |= 512;
                        lazyArr = lazyArr;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        break;
                    case 10:
                        strDecodeStringElement8 = strDecodeStringElement8;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str31);
                        i |= 1024;
                        lazyArr = lazyArr;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        break;
                    case 11:
                        strDecodeStringElement8 = strDecodeStringElement8;
                        routeNamingSchemeType3 = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, (DeserializationStrategy) lazyArr[11].getValue(), routeNamingSchemeType3);
                        i |= 2048;
                        lazyArr = lazyArr;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        break;
                    case 12:
                        strDecodeStringElement8 = strDecodeStringElement8;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str29);
                        i |= 4096;
                        lazyArr = lazyArr;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        break;
                    case 13:
                        strDecodeStringElement8 = strDecodeStringElement8;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str25);
                        i |= 8192;
                        lazyArr = lazyArr;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        break;
                    case 14:
                        strDecodeStringElement8 = strDecodeStringElement8;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str28);
                        i |= 16384;
                        lazyArr = lazyArr;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        break;
                    case 15:
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str27);
                        i2 = 32768;
                        i |= i2;
                        lazyArr = lazyArr;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        break;
                    case 16:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str26);
                        i2 = 65536;
                        i |= i2;
                        lazyArr = lazyArr;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        break;
                    case 17:
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str24);
                        i2 = 131072;
                        i |= i2;
                        lazyArr = lazyArr;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        break;
                    case 18:
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str30);
                        i2 = 262144;
                        i |= i2;
                        lazyArr = lazyArr;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        break;
                    case 19:
                        receiptFareDataApiResponseModel2 = (ReceiptFareDataApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, ReceiptFareDataApiResponseModel$$serializer.f8922a, receiptFareDataApiResponseModel2);
                        i2 = 524288;
                        i |= i2;
                        lazyArr = lazyArr;
                        strDecodeStringElement8 = strDecodeStringElement8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            routeNamingSchemeType = routeNamingSchemeType3;
            str = str24;
            str2 = str25;
            str3 = str30;
            str4 = str31;
            map = map3;
            receiptFareDataApiResponseModel = receiptFareDataApiResponseModel2;
            str5 = str26;
            str6 = str27;
            str7 = str28;
            str8 = str29;
            str9 = strDecodeStringElement13;
            str10 = strDecodeStringElement14;
            str11 = strDecodeStringElement9;
            str12 = strDecodeStringElement10;
            str13 = strDecodeStringElement11;
            str14 = strDecodeStringElement12;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement4;
            str15 = strDecodeStringElement8;
        }
        int i4 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InstantTicketReceipt(i4, str15, j, j2, str9, str10, str11, str12, str13, str14, map, str4, routeNamingSchemeType, str8, str2, str7, str6, str5, str, str3, receiptFareDataApiResponseModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0198  */
    /* JADX WARN: Code duplicated, block: B:108:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:113:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:78:0x013e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0150  */
    /* JADX WARN: Code duplicated, block: B:88:0x0162  */
    /* JADX WARN: Code duplicated, block: B:93:0x0174  */
    /* JADX WARN: Code duplicated, block: B:98:0x0186  */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RouteNamingSchemeType routeNamingSchemeType;
        InstantTicketReceipt value = (InstantTicketReceipt) obj;
        Intrinsics.i(value, "value");
        ReceiptFareDataApiResponseModel receiptFareDataApiResponseModel = value.t;
        String str = value.s;
        String str2 = value.r;
        String str3 = value.q;
        String str4 = value.p;
        String str5 = value.o;
        String str6 = value.n;
        String str7 = value.m;
        RouteNamingSchemeType routeNamingSchemeType2 = value.l;
        String str8 = value.k;
        Map map = value.j;
        String str9 = value.i;
        String str10 = value.h;
        String str11 = value.g;
        String str12 = value.f;
        String str13 = value.e;
        String str14 = value.d;
        long j = value.c;
        long j2 = value.b;
        String str15 = value.f3843a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = InstantTicketReceipt.u;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.d(str15, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str15);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || j2 != 0) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 1, j2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || j != 0) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.d(str14, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, str14);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.d(str13, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, str13);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.d(str12, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, str12);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.d(str11, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, str11);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.d(str10, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, str10);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.d(str9, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, str9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || map != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), map);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || str8 != 0) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str8);
        }
        if (!compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11)) {
            routeNamingSchemeType = routeNamingSchemeType2;
            if (routeNamingSchemeType != RouteNamingSchemeType.DEFAULT) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || str7 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str7);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || str6 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str6);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || str5 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str5);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || str4 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str4);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16) || str3 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str3);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17) || str2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str2);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18) || str != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19) || receiptFareDataApiResponseModel != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, ReceiptFareDataApiResponseModel$$serializer.f8922a, receiptFareDataApiResponseModel);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        routeNamingSchemeType = routeNamingSchemeType2;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, (SerializationStrategy) lazyArr[11].getValue(), routeNamingSchemeType);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str7);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str6);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str5);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str4);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str3);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str2);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, ReceiptFareDataApiResponseModel$$serializer.f8922a, receiptFareDataApiResponseModel);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, ReceiptFareDataApiResponseModel$$serializer.f8922a, receiptFareDataApiResponseModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
