package app.chalo.ondc.model.api;

import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketStopDetailsApiResponseModel;
import app.chalo.productbooking.common.data.models.api.response.GenericMobileTicketStopDetailsApiResponseModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.PaymentInfoApiModel;
import app.chalo.productbooking.common.data.models.api.response.PaymentInfoApiModel$$serializer;
import app.chalo.productbooking.common.data.models.api.response.RefundInfoApiModel;
import app.chalo.productbooking.common.data.models.api.response.RefundInfoApiModel$$serializer;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.List;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/ondc/model/api/OndcMetroTicketApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/ondc/model/api/OndcMetroTicketApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class OndcMetroTicketApiModel$$serializer implements GeneratedSerializer<OndcMetroTicketApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final OndcMetroTicketApiModel$$serializer f6727a;
    private static final SerialDescriptor descriptor;

    static {
        OndcMetroTicketApiModel$$serializer ondcMetroTicketApiModel$$serializer = new OndcMetroTicketApiModel$$serializer();
        f6727a = ondcMetroTicketApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.ondc.model.api.OndcMetroTicketApiModel", ondcMetroTicketApiModel$$serializer, 25);
        pluginGeneratedSerialDescriptor.j("bookingId", false);
        pluginGeneratedSerialDescriptor.j("productType", false);
        pluginGeneratedSerialDescriptor.j("productSubType", false);
        pluginGeneratedSerialDescriptor.j("bookingTime", false);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.AMOUNT, false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("qrCode", false);
        pluginGeneratedSerialDescriptor.j("validationEntities", false);
        pluginGeneratedSerialDescriptor.j("tone", false);
        pluginGeneratedSerialDescriptor.j("configurationId", false);
        pluginGeneratedSerialDescriptor.j("fromStopDetails", false);
        pluginGeneratedSerialDescriptor.j("toStopDetails", false);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("userId", false);
        pluginGeneratedSerialDescriptor.j("routeName", false);
        pluginGeneratedSerialDescriptor.j("expiryTime", false);
        pluginGeneratedSerialDescriptor.j("passengerDetails", false);
        pluginGeneratedSerialDescriptor.j("activationExpiryTime", false);
        pluginGeneratedSerialDescriptor.j("punchTime", false);
        pluginGeneratedSerialDescriptor.j("paymentMode", false);
        pluginGeneratedSerialDescriptor.j("paymentInfo", true);
        pluginGeneratedSerialDescriptor.j("refundInfo", false);
        pluginGeneratedSerialDescriptor.j("journeyOverview", true);
        pluginGeneratedSerialDescriptor.j("sellerBookingId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = OndcMetroTicketApiModel.z;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        LongSerializer longSerializer = LongSerializer.f18151a;
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(longSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(longSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c((KSerializer) lazyArr[8].getValue());
        KSerializer kSerializerC8 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC9 = BuiltinSerializersKt.c(stringSerializer);
        GenericMobileTicketStopDetailsApiResponseModel$$serializer genericMobileTicketStopDetailsApiResponseModel$$serializer = GenericMobileTicketStopDetailsApiResponseModel$$serializer.f8131a;
        return new KSerializer[]{kSerializerC, stringSerializer, stringSerializer, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, kSerializerC9, BuiltinSerializersKt.c(genericMobileTicketStopDetailsApiResponseModel$$serializer), BuiltinSerializersKt.c(genericMobileTicketStopDetailsApiResponseModel$$serializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[17].getValue()), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(PaymentInfoApiModel$$serializer.f8148a), BuiltinSerializersKt.c(RefundInfoApiModel$$serializer.f8182a), BuiltinSerializersKt.c((KSerializer) lazyArr[23].getValue()), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        List list;
        RefundInfoApiModel refundInfoApiModel;
        String str2;
        PaymentInfoApiModel paymentInfoApiModel;
        Long l;
        String str3;
        Long l2;
        List list2;
        String str4;
        Long l3;
        String str5;
        String str6;
        GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel;
        GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel2;
        String str7;
        Long l4;
        Long l5;
        String str8;
        String str9;
        String str10;
        List list3;
        String str11;
        String str12;
        String str13;
        int i2;
        int i3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OndcMetroTicketApiModel.z;
        String str14 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, longSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            GenericMobileTicketStopDetailsApiResponseModel$$serializer genericMobileTicketStopDetailsApiResponseModel$$serializer = GenericMobileTicketStopDetailsApiResponseModel$$serializer.f8131a;
            GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel3 = (GenericMobileTicketStopDetailsApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, genericMobileTicketStopDetailsApiResponseModel$$serializer, null);
            GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel4 = (GenericMobileTicketStopDetailsApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, genericMobileTicketStopDetailsApiResponseModel$$serializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            Long l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, longSerializer, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, (DeserializationStrategy) lazyArr[17].getValue(), null);
            Long l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, longSerializer, null);
            Long l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, longSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, null);
            PaymentInfoApiModel paymentInfoApiModel2 = (PaymentInfoApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, PaymentInfoApiModel$$serializer.f8148a, null);
            RefundInfoApiModel refundInfoApiModel2 = (RefundInfoApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, RefundInfoApiModel$$serializer.f8182a, null);
            i = 33554431;
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, (DeserializationStrategy) lazyArr[23].getValue(), null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, stringSerializer, null);
            str10 = str18;
            str9 = str17;
            str8 = str16;
            l4 = l6;
            l5 = l7;
            str13 = strDecodeStringElement2;
            str11 = str19;
            str12 = strDecodeStringElement;
            str3 = str15;
            str2 = str24;
            refundInfoApiModel = refundInfoApiModel2;
            paymentInfoApiModel = paymentInfoApiModel2;
            l = l10;
            l2 = l9;
            list2 = list5;
            str6 = str21;
            str4 = str23;
            str5 = str22;
            genericMobileTicketStopDetailsApiResponseModel = genericMobileTicketStopDetailsApiResponseModel4;
            l3 = l8;
            genericMobileTicketStopDetailsApiResponseModel2 = genericMobileTicketStopDetailsApiResponseModel3;
            str7 = str20;
            list3 = list4;
        } else {
            int i4 = 8;
            boolean z = true;
            i = 0;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            List list6 = null;
            RefundInfoApiModel refundInfoApiModel3 = null;
            String str28 = null;
            PaymentInfoApiModel paymentInfoApiModel3 = null;
            Long l11 = null;
            GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel5 = null;
            Long l12 = null;
            List list7 = null;
            Long l13 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str29 = null;
            Long l14 = null;
            Long l15 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            List list8 = null;
            String str33 = null;
            String str34 = null;
            GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel6 = null;
            while (z) {
                GenericMobileTicketStopDetailsApiResponseModel genericMobileTicketStopDetailsApiResponseModel7 = genericMobileTicketStopDetailsApiResponseModel5;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str25 = str25;
                        genericMobileTicketStopDetailsApiResponseModel7 = genericMobileTicketStopDetailsApiResponseModel7;
                        z = false;
                        str25 = str25;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        i4 = 8;
                        break;
                    case 0:
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str29);
                        i |= 1;
                        str26 = str26;
                        str25 = str25;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        l14 = l14;
                        i4 = 8;
                        break;
                    case 1:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        str26 = str26;
                        str25 = str25;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        i4 = 8;
                        break;
                    case 2:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        str26 = str26;
                        str25 = str25;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        i4 = 8;
                        break;
                    case 3:
                        l14 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l14);
                        i |= 8;
                        str26 = str26;
                        str25 = str25;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        l15 = l15;
                        i4 = 8;
                        break;
                    case 4:
                        l15 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l15);
                        i |= 16;
                        str26 = str26;
                        str25 = str25;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str30 = str30;
                        i4 = 8;
                        break;
                    case 5:
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str30);
                        i |= 32;
                        str26 = str26;
                        str25 = str25;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str31 = str31;
                        i4 = 8;
                        break;
                    case 6:
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str31);
                        i |= 64;
                        str26 = str26;
                        str25 = str25;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str32 = str32;
                        i4 = 8;
                        break;
                    case 7:
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str32);
                        i |= 128;
                        str26 = str26;
                        str25 = str25;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        list8 = list8;
                        i4 = 8;
                        break;
                    case 8:
                        String str35 = str26;
                        int i5 = i4;
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i4].getValue(), list8);
                        i |= 256;
                        str26 = str35;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str33 = str33;
                        i4 = i5;
                        str25 = str25;
                        break;
                    case 9:
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str33);
                        i |= 512;
                        str26 = str26;
                        str25 = str25;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str34 = str34;
                        break;
                    case 10:
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str34);
                        i |= 1024;
                        str26 = str26;
                        str25 = str25;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        genericMobileTicketStopDetailsApiResponseModel6 = genericMobileTicketStopDetailsApiResponseModel6;
                        break;
                    case 11:
                        genericMobileTicketStopDetailsApiResponseModel6 = (GenericMobileTicketStopDetailsApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, GenericMobileTicketStopDetailsApiResponseModel$$serializer.f8131a, genericMobileTicketStopDetailsApiResponseModel6);
                        i |= 2048;
                        str26 = str26;
                        str25 = str25;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        break;
                    case 12:
                        genericMobileTicketStopDetailsApiResponseModel5 = (GenericMobileTicketStopDetailsApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, GenericMobileTicketStopDetailsApiResponseModel$$serializer.f8131a, genericMobileTicketStopDetailsApiResponseModel7);
                        i |= 4096;
                        str26 = str26;
                        str25 = str25;
                        break;
                    case 13:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.f18170a, str25);
                        i |= 8192;
                        str26 = str26;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        break;
                    case 14:
                        str25 = str25;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str26);
                        i |= 16384;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str25 = str25;
                        break;
                    case 15:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.f18170a, str14);
                        i2 = 32768;
                        i |= i2;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str25 = str25;
                        break;
                    case 16:
                        l13 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, LongSerializer.f18151a, l13);
                        i2 = 65536;
                        i |= i2;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str25 = str25;
                        break;
                    case 17:
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, (DeserializationStrategy) lazyArr[17].getValue(), list7);
                        i2 = 131072;
                        i |= i2;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str25 = str25;
                        break;
                    case 18:
                        l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, LongSerializer.f18151a, l12);
                        i3 = 262144;
                        i |= i3;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str25 = str25;
                        break;
                    case 19:
                        l11 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, LongSerializer.f18151a, l11);
                        i3 = 524288;
                        i |= i3;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str25 = str25;
                        break;
                    case 20:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.f18170a, str28);
                        i3 = 1048576;
                        i |= i3;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str25 = str25;
                        break;
                    case 21:
                        paymentInfoApiModel3 = (PaymentInfoApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, PaymentInfoApiModel$$serializer.f8148a, paymentInfoApiModel3);
                        i3 = 2097152;
                        i |= i3;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str25 = str25;
                        break;
                    case 22:
                        refundInfoApiModel3 = (RefundInfoApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, RefundInfoApiModel$$serializer.f8182a, refundInfoApiModel3);
                        i3 = 4194304;
                        i |= i3;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str25 = str25;
                        break;
                    case 23:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, (DeserializationStrategy) lazyArr[23].getValue(), list6);
                        i3 = 8388608;
                        i |= i3;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str25 = str25;
                        break;
                    case 24:
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.f18170a, str27);
                        i2 = 16777216;
                        i |= i2;
                        genericMobileTicketStopDetailsApiResponseModel5 = genericMobileTicketStopDetailsApiResponseModel7;
                        str25 = str25;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str27;
            list = list6;
            refundInfoApiModel = refundInfoApiModel3;
            str2 = str28;
            paymentInfoApiModel = paymentInfoApiModel3;
            l = l11;
            str3 = str29;
            l2 = l12;
            list2 = list7;
            str4 = str14;
            l3 = l13;
            str5 = str26;
            str6 = str25;
            genericMobileTicketStopDetailsApiResponseModel = genericMobileTicketStopDetailsApiResponseModel5;
            genericMobileTicketStopDetailsApiResponseModel2 = genericMobileTicketStopDetailsApiResponseModel6;
            str7 = str34;
            l4 = l14;
            l5 = l15;
            str8 = str30;
            str9 = str31;
            str10 = str32;
            list3 = list8;
            str11 = str33;
            str12 = strDecodeStringElement3;
            str13 = strDecodeStringElement4;
        }
        int i6 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OndcMetroTicketApiModel(i6, str3, str12, str13, l4, l5, str8, str9, str10, list3, str11, str7, genericMobileTicketStopDetailsApiResponseModel2, genericMobileTicketStopDetailsApiResponseModel, str6, str5, str4, l3, list2, l2, l, str2, paymentInfoApiModel, refundInfoApiModel, list, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        OndcMetroTicketApiModel value = (OndcMetroTicketApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = OndcMetroTicketApiModel.z;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        String str = value.f6726a;
        String str2 = value.y;
        List list = value.x;
        PaymentInfoApiModel paymentInfoApiModel = value.v;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        LongSerializer longSerializer = LongSerializer.f18151a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, longSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, longSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, (SerializationStrategy) lazyArr[8].getValue(), value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, value.k);
        GenericMobileTicketStopDetailsApiResponseModel$$serializer genericMobileTicketStopDetailsApiResponseModel$$serializer = GenericMobileTicketStopDetailsApiResponseModel$$serializer.f8131a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, genericMobileTicketStopDetailsApiResponseModel$$serializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, genericMobileTicketStopDetailsApiResponseModel$$serializer, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, value.o);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, value.p);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, longSerializer, value.q);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, (SerializationStrategy) lazyArr[17].getValue(), value.r);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, longSerializer, value.s);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, longSerializer, value.t);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, value.u);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21) || paymentInfoApiModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, PaymentInfoApiModel$$serializer.f8148a, paymentInfoApiModel);
        }
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 22, RefundInfoApiModel$$serializer.f8182a, value.w);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 23) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, (SerializationStrategy) lazyArr[23].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 24) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 24, stringSerializer, str2);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
