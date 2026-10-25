package app.chalo.premiumbus.prebookedtickets.validation;

import app.chalo.data.RefundInfoAppModel;
import app.chalo.data.RefundInfoAppModel$$serializer;
import app.chalo.providers.RouteNamingSchemeType;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/prebookedtickets/validation/PremiumReserveTicketValidationReceiptData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/prebookedtickets/validation/PremiumReserveTicketValidationReceiptData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PremiumReserveTicketValidationReceiptData$$serializer implements GeneratedSerializer<PremiumReserveTicketValidationReceiptData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PremiumReserveTicketValidationReceiptData$$serializer f7488a;
    private static final SerialDescriptor descriptor;

    static {
        PremiumReserveTicketValidationReceiptData$$serializer premiumReserveTicketValidationReceiptData$$serializer = new PremiumReserveTicketValidationReceiptData$$serializer();
        f7488a = premiumReserveTicketValidationReceiptData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.prebookedtickets.validation.PremiumReserveTicketValidationReceiptData", premiumReserveTicketValidationReceiptData$$serializer, 15);
        pluginGeneratedSerialDescriptor.j("bookingId", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("punchTime", false);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.AMOUNT, false);
        pluginGeneratedSerialDescriptor.j("startStop", false);
        pluginGeneratedSerialDescriptor.j("endStop", false);
        pluginGeneratedSerialDescriptor.j("routeName", false);
        pluginGeneratedSerialDescriptor.j("conductorId", false);
        pluginGeneratedSerialDescriptor.j("vehicleNo", false);
        pluginGeneratedSerialDescriptor.j("passengerDetails", true);
        pluginGeneratedSerialDescriptor.j("endStopId", true);
        pluginGeneratedSerialDescriptor.j("via", true);
        pluginGeneratedSerialDescriptor.j("routeNamingSchemeType", true);
        pluginGeneratedSerialDescriptor.j("refundInfoAppModel", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PremiumReserveTicketValidationReceiptData.p;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, longSerializer, longSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.c((KSerializer) lazyArr[10].getValue()), stringSerializer, BuiltinSerializersKt.c(stringSerializer), lazyArr[13].getValue(), BuiltinSerializersKt.c(RefundInfoAppModel$$serializer.f2397a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String strDecodeStringElement;
        int i;
        Map map;
        RefundInfoAppModel refundInfoAppModel;
        RouteNamingSchemeType routeNamingSchemeType;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        long j;
        long j2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PremiumReserveTicketValidationReceiptData.p;
        int i2 = 5;
        int i3 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), null);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, null);
            RouteNamingSchemeType routeNamingSchemeType2 = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), null);
            i = 32767;
            refundInfoAppModel = (RefundInfoAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, RefundInfoAppModel$$serializer.f2397a, null);
            map = map2;
            str2 = strDecodeStringElement2;
            str8 = strDecodeStringElement8;
            str6 = strDecodeStringElement6;
            str5 = strDecodeStringElement5;
            str4 = strDecodeStringElement4;
            str7 = strDecodeStringElement7;
            str9 = strDecodeStringElement9;
            str = str10;
            str3 = strDecodeStringElement3;
            routeNamingSchemeType = routeNamingSchemeType2;
            j = jDecodeLongElement;
            j2 = jDecodeLongElement2;
        } else {
            strDecodeStringElement = null;
            RefundInfoAppModel refundInfoAppModel2 = null;
            RouteNamingSchemeType routeNamingSchemeType3 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            boolean z = true;
            long jDecodeLongElement3 = 0;
            long jDecodeLongElement4 = 0;
            i = 0;
            Map map3 = null;
            String str11 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        i |= 1;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 = 10;
                        break;
                    case 1:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        i3 = 10;
                        break;
                    case 2:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        i3 = 10;
                        break;
                    case 3:
                        jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i |= 8;
                        i3 = 10;
                        break;
                    case 4:
                        jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i |= 16;
                        i3 = 10;
                        break;
                    case 5:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i |= 32;
                        break;
                    case 6:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        i2 = 5;
                        break;
                    case 7:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        i2 = 5;
                        break;
                    case 8:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i |= 256;
                        i2 = 5;
                        break;
                    case 9:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i |= 512;
                        i2 = 5;
                        break;
                    case 10:
                        map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), map3);
                        i |= 1024;
                        i2 = 5;
                        break;
                    case 11:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i |= 2048;
                        i2 = 5;
                        break;
                    case 12:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str11);
                        i |= 4096;
                        i2 = 5;
                        break;
                    case 13:
                        routeNamingSchemeType3 = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), routeNamingSchemeType3);
                        i |= 8192;
                        i2 = 5;
                        break;
                    case 14:
                        refundInfoAppModel2 = (RefundInfoAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, RefundInfoAppModel$$serializer.f2397a, refundInfoAppModel2);
                        i |= 16384;
                        i2 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            map = map3;
            refundInfoAppModel = refundInfoAppModel2;
            routeNamingSchemeType = routeNamingSchemeType3;
            str = str11;
            str2 = strDecodeStringElement16;
            str3 = strDecodeStringElement17;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement11;
            str6 = strDecodeStringElement12;
            str7 = strDecodeStringElement13;
            str8 = strDecodeStringElement14;
            str9 = strDecodeStringElement15;
            j = jDecodeLongElement3;
            j2 = jDecodeLongElement4;
        }
        String str12 = strDecodeStringElement;
        int i4 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PremiumReserveTicketValidationReceiptData(i4, str12, str2, str3, j, j2, str4, str5, str6, str7, str8, map, str9, str, routeNamingSchemeType, refundInfoAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PremiumReserveTicketValidationReceiptData value = (PremiumReserveTicketValidationReceiptData) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PremiumReserveTicketValidationReceiptData.p;
        String str = value.f7487a;
        RefundInfoAppModel refundInfoAppModel = value.o;
        RouteNamingSchemeType routeNamingSchemeType = value.n;
        String str2 = value.m;
        String str3 = value.l;
        Map map = value.k;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 7, value.h);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 8, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.j);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || map != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), map);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.d(str3, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 11, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || routeNamingSchemeType != RouteNamingSchemeType.DEFAULT) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 13, (SerializationStrategy) lazyArr[13].getValue(), routeNamingSchemeType);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || refundInfoAppModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, RefundInfoAppModel$$serializer.f2397a, refundInfoAppModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
