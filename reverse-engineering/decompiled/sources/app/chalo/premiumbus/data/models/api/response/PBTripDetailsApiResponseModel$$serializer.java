package app.chalo.premiumbus.data.models.api.response;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/premiumbus/data/models/api/response/PBTripDetailsApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/premiumbus/data/models/api/response/PBTripDetailsApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PBTripDetailsApiResponseModel$$serializer implements GeneratedSerializer<PBTripDetailsApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PBTripDetailsApiResponseModel$$serializer f7033a;
    private static final SerialDescriptor descriptor;

    static {
        PBTripDetailsApiResponseModel$$serializer pBTripDetailsApiResponseModel$$serializer = new PBTripDetailsApiResponseModel$$serializer();
        f7033a = pBTripDetailsApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.premiumbus.data.models.api.response.PBTripDetailsApiResponseModel", pBTripDetailsApiResponseModel$$serializer, 15);
        pluginGeneratedSerialDescriptor.j("tripStatus", false);
        pluginGeneratedSerialDescriptor.j("bookingStatus", false);
        pluginGeneratedSerialDescriptor.j("bookingId", false);
        pluginGeneratedSerialDescriptor.j("vehicleNo", false);
        pluginGeneratedSerialDescriptor.j("tripId", false);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("stopId", false);
        pluginGeneratedSerialDescriptor.j("scheduledStopTime", false);
        pluginGeneratedSerialDescriptor.j("estimatedStopTime", false);
        pluginGeneratedSerialDescriptor.j("assignedSeats", false);
        pluginGeneratedSerialDescriptor.j("tripCommunication", false);
        pluginGeneratedSerialDescriptor.j("tripScheduledStartTime", false);
        pluginGeneratedSerialDescriptor.j("seats", false);
        pluginGeneratedSerialDescriptor.j("womenAdjacencyPromise", false);
        pluginGeneratedSerialDescriptor.j("vehicleBreakdown", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PBTripDetailsApiResponseModel.p;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c(stringSerializer);
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[9].getValue()), BuiltinSerializersKt.c(PbTripCommunicationApiResponseModel$$serializer.f7035a), BuiltinSerializersKt.c(longSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[12].getValue()), BuiltinSerializersKt.c(BooleanSerializer.f18123a), BuiltinSerializersKt.c(VehicleBreakdownApiResponseModel$$serializer.f7069a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        List list;
        String str2;
        String str3;
        PbTripCommunicationApiResponseModel pbTripCommunicationApiResponseModel;
        List list2;
        Long l;
        String str4;
        Long l2;
        Long l3;
        String str5;
        String str6;
        String str7;
        VehicleBreakdownApiResponseModel vehicleBreakdownApiResponseModel;
        Boolean bool;
        String str8;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PBTripDetailsApiResponseModel.p;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            LongSerializer longSerializer = LongSerializer.f18151a;
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, longSerializer, null);
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, longSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            PbTripCommunicationApiResponseModel pbTripCommunicationApiResponseModel2 = (PbTripCommunicationApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, PbTripCommunicationApiResponseModel$$serializer.f7035a, null);
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, longSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.f18123a, null);
            i = 32767;
            vehicleBreakdownApiResponseModel = (VehicleBreakdownApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, VehicleBreakdownApiResponseModel$$serializer.f7069a, null);
            str4 = str15;
            list2 = list3;
            str6 = str10;
            l2 = l6;
            l3 = l4;
            str5 = str14;
            str3 = str12;
            l = l5;
            str2 = str13;
            str7 = str11;
            str = str9;
            bool = bool2;
            list = list4;
            pbTripCommunicationApiResponseModel = pbTripCommunicationApiResponseModel2;
        } else {
            int i2 = 9;
            boolean z = true;
            Boolean bool3 = null;
            VehicleBreakdownApiResponseModel vehicleBreakdownApiResponseModel2 = null;
            List list5 = null;
            String str16 = null;
            String str17 = null;
            PbTripCommunicationApiResponseModel pbTripCommunicationApiResponseModel3 = null;
            List list6 = null;
            Long l7 = null;
            String str18 = null;
            Long l8 = null;
            Long l9 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            i = 0;
            String str22 = null;
            while (z) {
                String str23 = str17;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str8 = str23;
                        z = false;
                        str17 = str8;
                        vehicleBreakdownApiResponseModel2 = vehicleBreakdownApiResponseModel2;
                        bool3 = bool3;
                        i2 = 9;
                        break;
                    case 0:
                        str8 = str23;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str20);
                        i |= 1;
                        str22 = str22;
                        str21 = str21;
                        str17 = str8;
                        vehicleBreakdownApiResponseModel2 = vehicleBreakdownApiResponseModel2;
                        bool3 = bool3;
                        i2 = 9;
                        break;
                    case 1:
                        str8 = str23;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str21);
                        i |= 2;
                        str22 = str22;
                        str17 = str8;
                        vehicleBreakdownApiResponseModel2 = vehicleBreakdownApiResponseModel2;
                        bool3 = bool3;
                        i2 = 9;
                        break;
                    case 2:
                        i |= 4;
                        str22 = str22;
                        vehicleBreakdownApiResponseModel2 = vehicleBreakdownApiResponseModel2;
                        i2 = 9;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str23);
                        bool3 = bool3;
                        break;
                    case 3:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str22);
                        i |= 8;
                        bool3 = bool3;
                        str17 = str23;
                        i2 = 9;
                        break;
                    case 4:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str16);
                        i |= 16;
                        str17 = str23;
                        str22 = str22;
                        i2 = 9;
                        break;
                    case 5:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str19);
                        i |= 32;
                        str17 = str23;
                        str22 = str22;
                        i2 = 9;
                        break;
                    case 6:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str18);
                        i |= 64;
                        str17 = str23;
                        str22 = str22;
                        i2 = 9;
                        break;
                    case 7:
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.f18151a, l9);
                        i |= 128;
                        str17 = str23;
                        str22 = str22;
                        i2 = 9;
                        break;
                    case 8:
                        l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.f18151a, l7);
                        i |= 256;
                        str17 = str23;
                        str22 = str22;
                        i2 = 9;
                        break;
                    case 9:
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, (DeserializationStrategy) lazyArr[i2].getValue(), list6);
                        i |= 512;
                        str17 = str23;
                        str22 = str22;
                        break;
                    case 10:
                        pbTripCommunicationApiResponseModel3 = (PbTripCommunicationApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, PbTripCommunicationApiResponseModel$$serializer.f7035a, pbTripCommunicationApiResponseModel3);
                        i |= 1024;
                        str17 = str23;
                        str22 = str22;
                        break;
                    case 11:
                        l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, LongSerializer.f18151a, l8);
                        i |= 2048;
                        str17 = str23;
                        str22 = str22;
                        break;
                    case 12:
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), list5);
                        i |= 4096;
                        str17 = str23;
                        str22 = str22;
                        break;
                    case 13:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.f18123a, bool3);
                        i |= 8192;
                        str17 = str23;
                        str22 = str22;
                        break;
                    case 14:
                        vehicleBreakdownApiResponseModel2 = (VehicleBreakdownApiResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, VehicleBreakdownApiResponseModel$$serializer.f7069a, vehicleBreakdownApiResponseModel2);
                        i |= 16384;
                        str17 = str23;
                        str22 = str22;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str20;
            list = list5;
            str2 = str16;
            str3 = str22;
            pbTripCommunicationApiResponseModel = pbTripCommunicationApiResponseModel3;
            list2 = list6;
            l = l7;
            str4 = str18;
            l2 = l8;
            l3 = l9;
            str5 = str19;
            str6 = str21;
            str7 = str17;
            vehicleBreakdownApiResponseModel = vehicleBreakdownApiResponseModel2;
            bool = bool3;
        }
        int i3 = i;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PBTripDetailsApiResponseModel(i3, str, str6, str7, str3, str2, str5, str4, l3, l, list2, pbTripCommunicationApiResponseModel, l2, list, bool, vehicleBreakdownApiResponseModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PBTripDetailsApiResponseModel value = (PBTripDetailsApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PBTripDetailsApiResponseModel.p;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f7032a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.g);
        LongSerializer longSerializer = LongSerializer.f18151a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, longSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, longSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, PbTripCommunicationApiResponseModel$$serializer.f7035a, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, longSerializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, (SerializationStrategy) lazyArr[12].getValue(), value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.f18123a, value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, VehicleBreakdownApiResponseModel$$serializer.f7069a, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
