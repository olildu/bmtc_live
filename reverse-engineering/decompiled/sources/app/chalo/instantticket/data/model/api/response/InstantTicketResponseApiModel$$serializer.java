package app.chalo.instantticket.data.model.api.response;

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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/instantticket/data/model/api/response/InstantTicketResponseApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/instantticket/data/model/api/response/InstantTicketResponseApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class InstantTicketResponseApiModel$$serializer implements GeneratedSerializer<InstantTicketResponseApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InstantTicketResponseApiModel$$serializer f3870a;
    private static final SerialDescriptor descriptor;

    static {
        InstantTicketResponseApiModel$$serializer instantTicketResponseApiModel$$serializer = new InstantTicketResponseApiModel$$serializer();
        f3870a = instantTicketResponseApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.instantticket.data.model.api.response.InstantTicketResponseApiModel", instantTicketResponseApiModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.j("bookingId", false);
        pluginGeneratedSerialDescriptor.j("userId", false);
        pluginGeneratedSerialDescriptor.j("productName", false);
        pluginGeneratedSerialDescriptor.j("bookingTime", false);
        pluginGeneratedSerialDescriptor.j(PaymentConstants.AMOUNT, false);
        pluginGeneratedSerialDescriptor.j("status", false);
        pluginGeneratedSerialDescriptor.j("punchTime", false);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("qrCode", false);
        pluginGeneratedSerialDescriptor.j("tone", false);
        pluginGeneratedSerialDescriptor.j("configurationId", false);
        pluginGeneratedSerialDescriptor.j("routeDetails", false);
        pluginGeneratedSerialDescriptor.j("passengerDetails", false);
        pluginGeneratedSerialDescriptor.j("activationExpiryTime", false);
        pluginGeneratedSerialDescriptor.j("refundInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = InstantTicketResponseApiModel.p;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(InstantTicketRouteDetailsApiModel$$serializer.f3872a), BuiltinSerializersKt.c((KSerializer) lazyArr[12].getValue()), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(RefundInfoApiModel$$serializer.f8182a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        Long l;
        Long l2;
        List list;
        String str2;
        String str3;
        String str4;
        Long l3;
        InstantTicketRouteDetailsApiModel instantTicketRouteDetailsApiModel;
        String str5;
        String str6;
        String str7;
        String str8;
        RefundInfoApiModel refundInfoApiModel;
        Long l4;
        String str9;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = InstantTicketResponseApiModel.p;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, longSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, longSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            InstantTicketRouteDetailsApiModel instantTicketRouteDetailsApiModel2 = (InstantTicketRouteDetailsApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, InstantTicketRouteDetailsApiModel$$serializer.f3872a, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), null);
            Long l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, longSerializer, null);
            i = 32767;
            refundInfoApiModel = (RefundInfoApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, RefundInfoApiModel$$serializer.f8182a, null);
            l4 = l8;
            str = str10;
            str7 = str11;
            str3 = str16;
            str5 = str14;
            l3 = l7;
            str6 = str13;
            l2 = l5;
            str4 = str15;
            l = l6;
            str8 = str12;
            list = list2;
            instantTicketRouteDetailsApiModel = instantTicketRouteDetailsApiModel2;
            str2 = str17;
        } else {
            boolean z = true;
            Long l9 = null;
            RefundInfoApiModel refundInfoApiModel2 = null;
            Long l10 = null;
            String str18 = null;
            List list3 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            Long l11 = null;
            InstantTicketRouteDetailsApiModel instantTicketRouteDetailsApiModel3 = null;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            i = 0;
            Long l12 = null;
            while (z) {
                String str26 = str18;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str9 = str26;
                        z = false;
                        str18 = str9;
                        refundInfoApiModel2 = refundInfoApiModel2;
                        l9 = l9;
                        break;
                    case 0:
                        str9 = str26;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str24);
                        i |= 1;
                        l12 = l12;
                        str25 = str25;
                        str18 = str9;
                        refundInfoApiModel2 = refundInfoApiModel2;
                        l9 = l9;
                        break;
                    case 1:
                        str9 = str26;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str25);
                        i |= 2;
                        l12 = l12;
                        str18 = str9;
                        refundInfoApiModel2 = refundInfoApiModel2;
                        l9 = l9;
                        break;
                    case 2:
                        l9 = l9;
                        i |= 4;
                        l12 = l12;
                        refundInfoApiModel2 = refundInfoApiModel2;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str26);
                        l9 = l9;
                        break;
                    case 3:
                        l12 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l12);
                        i |= 8;
                        l9 = l9;
                        str18 = str26;
                        break;
                    case 4:
                        l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.f18151a, l10);
                        i |= 16;
                        str18 = str26;
                        l12 = l12;
                        break;
                    case 5:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str23);
                        i |= 32;
                        str18 = str26;
                        l12 = l12;
                        break;
                    case 6:
                        l11 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.f18151a, l11);
                        i |= 64;
                        str18 = str26;
                        l12 = l12;
                        break;
                    case 7:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str22);
                        i |= 128;
                        str18 = str26;
                        l12 = l12;
                        break;
                    case 8:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str21);
                        i |= 256;
                        str18 = str26;
                        l12 = l12;
                        break;
                    case 9:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str20);
                        i |= 512;
                        str18 = str26;
                        l12 = l12;
                        break;
                    case 10:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str19);
                        i |= 1024;
                        str18 = str26;
                        l12 = l12;
                        break;
                    case 11:
                        instantTicketRouteDetailsApiModel3 = (InstantTicketRouteDetailsApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, InstantTicketRouteDetailsApiModel$$serializer.f3872a, instantTicketRouteDetailsApiModel3);
                        i |= 2048;
                        str18 = str26;
                        l12 = l12;
                        break;
                    case 12:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), list3);
                        i |= 4096;
                        str18 = str26;
                        l12 = l12;
                        break;
                    case 13:
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.f18151a, l9);
                        i |= 8192;
                        str18 = str26;
                        l12 = l12;
                        break;
                    case 14:
                        refundInfoApiModel2 = (RefundInfoApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, RefundInfoApiModel$$serializer.f8182a, refundInfoApiModel2);
                        i |= 16384;
                        str18 = str26;
                        l12 = l12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str24;
            l = l10;
            l2 = l12;
            list = list3;
            str2 = str19;
            str3 = str20;
            str4 = str21;
            l3 = l11;
            instantTicketRouteDetailsApiModel = instantTicketRouteDetailsApiModel3;
            str5 = str22;
            str6 = str23;
            str7 = str25;
            str8 = str18;
            refundInfoApiModel = refundInfoApiModel2;
            l4 = l9;
        }
        int i2 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InstantTicketResponseApiModel(i2, str, str7, str8, l2, l, str6, l3, str5, str4, str3, str2, instantTicketRouteDetailsApiModel, list, l4, refundInfoApiModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        InstantTicketResponseApiModel value = (InstantTicketResponseApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = InstantTicketResponseApiModel.p;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f3869a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.c);
        LongSerializer longSerializer = LongSerializer.f18151a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, longSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, longSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, longSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, InstantTicketRouteDetailsApiModel$$serializer.f3872a, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, (SerializationStrategy) lazyArr[12].getValue(), value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, longSerializer, value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, RefundInfoApiModel$$serializer.f8182a, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
