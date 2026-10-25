package app.chalo.walletframework.quickpay.data.repository.entity;

import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.receipt.ReceiptFareDataAppModel;
import app.chalo.receipt.ReceiptFareDataAppModel$$serializer;
import in.juspay.hypersdk.core.PaymentConstants;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/walletframework/quickpay/data/repository/entity/QuickPayReceipt.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/walletframework/quickpay/data/repository/entity/QuickPayReceipt;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class QuickPayReceipt$$serializer implements GeneratedSerializer<QuickPayReceipt> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final QuickPayReceipt$$serializer f10933a;
    private static final SerialDescriptor descriptor;

    static {
        QuickPayReceipt$$serializer quickPayReceipt$$serializer = new QuickPayReceipt$$serializer();
        f10933a = quickPayReceipt$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.walletframework.quickpay.data.repository.entity.QuickPayReceipt", quickPayReceipt$$serializer, 21);
        pluginGeneratedSerialDescriptor.j("transactionId", true);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.ORDER_ID_CAMEL, true);
        pluginGeneratedSerialDescriptor.j("punchTime", true);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.AMOUNT, true);
        pluginGeneratedSerialDescriptor.j("vehicleNo", true);
        pluginGeneratedSerialDescriptor.j("conductorId", true);
        pluginGeneratedSerialDescriptor.j("startStop", true);
        pluginGeneratedSerialDescriptor.j("endStop", true);
        pluginGeneratedSerialDescriptor.j("routeName", true);
        pluginGeneratedSerialDescriptor.j("endStopId", true);
        pluginGeneratedSerialDescriptor.j("productReceiptPassengerDetails", true);
        pluginGeneratedSerialDescriptor.j("via", true);
        pluginGeneratedSerialDescriptor.j("routeNamingScheme", true);
        pluginGeneratedSerialDescriptor.j("depotName", true);
        pluginGeneratedSerialDescriptor.j("etimGeneratedTicketId", true);
        pluginGeneratedSerialDescriptor.j("scheduleNumber", true);
        pluginGeneratedSerialDescriptor.j("routeServiceType", true);
        pluginGeneratedSerialDescriptor.j("driverId", true);
        pluginGeneratedSerialDescriptor.j("waybillNo", true);
        pluginGeneratedSerialDescriptor.j("etimVersion", true);
        pluginGeneratedSerialDescriptor.j("ticketFareData", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = QuickPayReceipt.v;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{stringSerializer, stringSerializer, longSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.c((KSerializer) lazyArr[10].getValue()), BuiltinSerializersKt.c(stringSerializer), lazyArr[12].getValue(), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(ReceiptFareDataAppModel$$serializer.f8924a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        RouteNamingSchemeType routeNamingSchemeType;
        String str2;
        String str3;
        Map map;
        ReceiptFareDataAppModel receiptFareDataAppModel;
        String str4;
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
        String str15;
        String str16;
        long j;
        long j2;
        int i2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = QuickPayReceipt.v;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            RouteNamingSchemeType routeNamingSchemeType2 = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, stringSerializer, null);
            i = 2097151;
            receiptFareDataAppModel = (ReceiptFareDataAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, ReceiptFareDataAppModel$$serializer.f8924a, null);
            str = str18;
            j2 = jDecodeLongElement2;
            str15 = strDecodeStringElement7;
            str11 = strDecodeStringElement3;
            str10 = strDecodeStringElement2;
            map = map2;
            str12 = strDecodeStringElement4;
            str16 = strDecodeStringElement8;
            str14 = strDecodeStringElement6;
            str13 = strDecodeStringElement5;
            str5 = str24;
            str2 = str23;
            str6 = str22;
            str7 = str21;
            str8 = str20;
            str3 = str19;
            routeNamingSchemeType = routeNamingSchemeType2;
            str9 = strDecodeStringElement;
            j = jDecodeLongElement;
            str4 = str17;
        } else {
            long j3 = 0;
            long jDecodeLongElement3 = 0;
            int i3 = 10;
            boolean z = true;
            String str25 = null;
            RouteNamingSchemeType routeNamingSchemeType3 = null;
            String str26 = null;
            String str27 = null;
            ReceiptFareDataAppModel receiptFareDataAppModel2 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            i = 0;
            Map map3 = null;
            while (true) {
                long jDecodeLongElement4 = j3;
                if (z) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            z = false;
                            j3 = jDecodeLongElement4;
                            i3 = 10;
                            break;
                        case 0:
                            strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                            i |= 1;
                            j3 = jDecodeLongElement4;
                            i3 = 10;
                            break;
                        case 1:
                            strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i |= 2;
                            j3 = jDecodeLongElement4;
                            i3 = 10;
                            break;
                        case 2:
                            jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                            i |= 4;
                            j3 = jDecodeLongElement4;
                            i3 = 10;
                            break;
                        case 3:
                            jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                            i |= 8;
                            j3 = jDecodeLongElement4;
                            i3 = 10;
                            break;
                        case 4:
                            strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                            i |= 16;
                            j3 = jDecodeLongElement4;
                            i3 = 10;
                            break;
                        case 5:
                            strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                            i |= 32;
                            j3 = jDecodeLongElement4;
                            i3 = 10;
                            break;
                        case 6:
                            strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                            i |= 64;
                            j3 = jDecodeLongElement4;
                            i3 = 10;
                            break;
                        case 7:
                            strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                            i |= 128;
                            j3 = jDecodeLongElement4;
                            i3 = 10;
                            break;
                        case 8:
                            strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                            i |= 256;
                            j3 = jDecodeLongElement4;
                            i3 = 10;
                            break;
                        case 9:
                            strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                            i |= 512;
                            j3 = jDecodeLongElement4;
                            break;
                        case 10:
                            map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), map3);
                            i |= 1024;
                            j3 = jDecodeLongElement4;
                            break;
                        case 11:
                            str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str28);
                            i |= 2048;
                            j3 = jDecodeLongElement4;
                            break;
                        case 12:
                            routeNamingSchemeType3 = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), routeNamingSchemeType3);
                            i |= 4096;
                            j3 = jDecodeLongElement4;
                            break;
                        case 13:
                            str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str25);
                            i |= 8192;
                            j3 = jDecodeLongElement4;
                            break;
                        case 14:
                            str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str27);
                            i |= 16384;
                            j3 = jDecodeLongElement4;
                            break;
                        case 15:
                            str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str32);
                            i2 = 32768;
                            i |= i2;
                            j3 = jDecodeLongElement4;
                            break;
                        case 16:
                            str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str31);
                            i2 = 65536;
                            i |= i2;
                            j3 = jDecodeLongElement4;
                            break;
                        case 17:
                            str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str30);
                            i2 = 131072;
                            i |= i2;
                            j3 = jDecodeLongElement4;
                            break;
                        case 18:
                            str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str26);
                            i2 = 262144;
                            i |= i2;
                            j3 = jDecodeLongElement4;
                            break;
                        case 19:
                            str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.f18170a, str29);
                            i2 = 524288;
                            i |= i2;
                            j3 = jDecodeLongElement4;
                            break;
                        case 20:
                            receiptFareDataAppModel2 = (ReceiptFareDataAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, ReceiptFareDataAppModel$$serializer.f8924a, receiptFareDataAppModel2);
                            i2 = 1048576;
                            i |= i2;
                            j3 = jDecodeLongElement4;
                            break;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                } else {
                    str = str25;
                    routeNamingSchemeType = routeNamingSchemeType3;
                    str2 = str26;
                    str3 = str27;
                    map = map3;
                    receiptFareDataAppModel = receiptFareDataAppModel2;
                    str4 = str28;
                    str5 = str29;
                    str6 = str30;
                    str7 = str31;
                    str8 = str32;
                    str9 = strDecodeStringElement9;
                    str10 = strDecodeStringElement10;
                    str11 = strDecodeStringElement11;
                    str12 = strDecodeStringElement12;
                    str13 = strDecodeStringElement13;
                    str14 = strDecodeStringElement14;
                    str15 = strDecodeStringElement15;
                    str16 = strDecodeStringElement16;
                    j = jDecodeLongElement3;
                    j2 = jDecodeLongElement4;
                }
            }
        }
        int i4 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new QuickPayReceipt(i4, str9, str10, j, j2, str11, str12, str13, str14, str15, str16, map, str4, routeNamingSchemeType, str, str3, str8, str7, str6, str2, str5, receiptFareDataAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x019e  */
    /* JADX WARN: Code duplicated, block: B:109:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:84:0x0156  */
    /* JADX WARN: Code duplicated, block: B:89:0x0168  */
    /* JADX WARN: Code duplicated, block: B:94:0x017a  */
    /* JADX WARN: Code duplicated, block: B:99:0x018c  */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RouteNamingSchemeType routeNamingSchemeType;
        QuickPayReceipt value = (QuickPayReceipt) obj;
        Intrinsics.i(value, "value");
        ReceiptFareDataAppModel receiptFareDataAppModel = value.u;
        String str = value.t;
        String str2 = value.s;
        String str3 = value.r;
        String str4 = value.q;
        String str5 = value.p;
        String str6 = value.o;
        String str7 = value.n;
        RouteNamingSchemeType routeNamingSchemeType2 = value.m;
        String str8 = value.l;
        Map map = value.k;
        String str9 = value.j;
        String str10 = value.i;
        String str11 = value.h;
        String str12 = value.g;
        String str13 = value.f;
        String str14 = value.e;
        long j = value.d;
        long j2 = value.c;
        String str15 = value.b;
        String str16 = value.f10932a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = QuickPayReceipt.v;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.d(str16, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str16);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.d(str15, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, str15);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || j2 != 0) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, j2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || j != 0) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.d(str14, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, str14);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.d(str13, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, str13);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.d(str12, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, str12);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.d(str11, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, str11);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.d(str10, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, str10);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.d(str9, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, str9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || map != 0) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), map);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || str8 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, str8);
        }
        if (!compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12)) {
            routeNamingSchemeType = routeNamingSchemeType2;
            if (routeNamingSchemeType != RouteNamingSchemeType.DEFAULT) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || str7 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str7);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || str6 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str6);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || str5 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str5);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16) || str4 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str4);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17) || str3 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str3);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18) || str2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str2);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19) || str != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.f18170a, str);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20) || receiptFareDataAppModel != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, ReceiptFareDataAppModel$$serializer.f8924a, receiptFareDataAppModel);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        routeNamingSchemeType = routeNamingSchemeType2;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 12, (SerializationStrategy) lazyArr[12].getValue(), routeNamingSchemeType);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str7);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str6);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str5);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str4);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str3);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str2);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.f18170a, str);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, ReceiptFareDataAppModel$$serializer.f8924a, receiptFareDataAppModel);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, ReceiptFareDataAppModel$$serializer.f8924a, receiptFareDataAppModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
