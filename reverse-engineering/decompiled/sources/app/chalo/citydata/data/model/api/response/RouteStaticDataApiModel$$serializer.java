package app.chalo.citydata.data.model.api.response;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/citydata/data/model/api/response/RouteStaticDataApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/citydata/data/model/api/response/RouteStaticDataApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RouteStaticDataApiModel$$serializer implements GeneratedSerializer<RouteStaticDataApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RouteStaticDataApiModel$$serializer f1681a;
    private static final SerialDescriptor descriptor;

    static {
        RouteStaticDataApiModel$$serializer routeStaticDataApiModel$$serializer = new RouteStaticDataApiModel$$serializer();
        f1681a = routeStaticDataApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.citydata.data.model.api.response.RouteStaticDataApiModel", routeStaticDataApiModel$$serializer, 23);
        pluginGeneratedSerialDescriptor.j("route_name", true);
        pluginGeneratedSerialDescriptor.j("agency_name", true);
        pluginGeneratedSerialDescriptor.j("specialFeatures", true);
        pluginGeneratedSerialDescriptor.j("ticketingAllowed", true);
        pluginGeneratedSerialDescriptor.j("mTicketEnabled", true);
        pluginGeneratedSerialDescriptor.j("routePassEnabled", true);
        pluginGeneratedSerialDescriptor.j("isFreeRide", true);
        pluginGeneratedSerialDescriptor.j("polyline", true);
        pluginGeneratedSerialDescriptor.j("d", true);
        pluginGeneratedSerialDescriptor.j("so", true);
        pluginGeneratedSerialDescriptor.j("isAirportRoute", true);
        pluginGeneratedSerialDescriptor.j("isPremiumBusRoute", true);
        pluginGeneratedSerialDescriptor.j("stopSequenceWithDetails", true);
        pluginGeneratedSerialDescriptor.j("trafficSignals", true);
        pluginGeneratedSerialDescriptor.j("stationType", true);
        pluginGeneratedSerialDescriptor.j("hasFrequencyTrips", true);
        pluginGeneratedSerialDescriptor.j("isShortTripEnabled", true);
        pluginGeneratedSerialDescriptor.j("ttStatus", true);
        pluginGeneratedSerialDescriptor.j("ttSid", true);
        pluginGeneratedSerialDescriptor.j("timeTable", true);
        pluginGeneratedSerialDescriptor.j("sht", true);
        pluginGeneratedSerialDescriptor.j("via", true);
        pluginGeneratedSerialDescriptor.j("routeNamingScheme", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RouteStaticDataApiModel.x;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c((KSerializer) lazyArr[2].getValue());
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(booleanSerializer);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(booleanSerializer);
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(booleanSerializer);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c(booleanSerializer);
        KSerializer kSerializerC8 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC9 = BuiltinSerializersKt.c(booleanSerializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, kSerializerC9, BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[12].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[13].getValue()), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c(intSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[19].getValue()), BuiltinSerializersKt.c((KSerializer) lazyArr[20].getValue()), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        Integer num;
        Boolean bool;
        List list;
        Boolean bool2;
        Integer num2;
        List list2;
        Boolean bool3;
        List list3;
        String str3;
        String str4;
        String str5;
        List list4;
        String str6;
        List list5;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        int i;
        Boolean bool8;
        Integer num3;
        Boolean bool9;
        int i2;
        Boolean bool10;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RouteStaticDataApiModel.x;
        List list6 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            List list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            Boolean bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            Boolean bool13 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            Boolean bool14 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            Boolean bool15 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            IntSerializer intSerializer = IntSerializer.f18146a;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, intSerializer, null);
            Boolean bool16 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            Boolean bool17 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            List list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), null);
            List list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            Boolean bool18 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, booleanSerializer, null);
            Boolean bool19 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, booleanSerializer, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, intSerializer, null);
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, intSerializer, null);
            List list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, (DeserializationStrategy) lazyArr[19].getValue(), null);
            List list11 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, (DeserializationStrategy) lazyArr[20].getValue(), null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, stringSerializer, null);
            i = 8388607;
            str4 = str11;
            str5 = str10;
            bool8 = bool15;
            bool5 = bool12;
            str = str7;
            list5 = list7;
            num = num5;
            num3 = num4;
            str2 = str9;
            bool7 = bool14;
            bool6 = bool13;
            list = list11;
            num2 = num6;
            bool2 = bool19;
            list4 = list10;
            bool3 = bool18;
            list2 = list9;
            list3 = list8;
            str6 = str8;
            bool9 = bool16;
            bool4 = bool11;
            bool = bool17;
        } else {
            boolean z = true;
            int i3 = 0;
            int i4 = 2;
            String str12 = null;
            List list12 = null;
            Integer num7 = null;
            Boolean bool20 = null;
            List list13 = null;
            Boolean bool21 = null;
            Integer num8 = null;
            Boolean bool22 = null;
            List list14 = null;
            Boolean bool23 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            List list15 = null;
            Boolean bool24 = null;
            Boolean bool25 = null;
            Boolean bool26 = null;
            Boolean bool27 = null;
            String str17 = null;
            Boolean bool28 = null;
            Integer num9 = null;
            while (z) {
                Boolean bool29 = bool23;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        str12 = str12;
                        list12 = list12;
                        i3 = i3;
                        bool23 = bool29;
                        i4 = 2;
                        break;
                    case 0:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str15);
                        i3 |= 1;
                        str12 = str12;
                        list12 = list12;
                        str16 = str16;
                        bool23 = bool29;
                        i4 = 2;
                        break;
                    case 1:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str16);
                        i3 |= 2;
                        str12 = str12;
                        list12 = list12;
                        list15 = list15;
                        bool23 = bool29;
                        i4 = 2;
                        break;
                    case 2:
                        String str18 = str12;
                        DeserializationStrategy deserializationStrategy = (DeserializationStrategy) lazyArr[i4].getValue();
                        int i5 = i4;
                        list15 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, deserializationStrategy, list15);
                        list12 = list12;
                        bool24 = bool24;
                        bool23 = bool29;
                        i4 = i5;
                        i3 |= 4;
                        str12 = str18;
                        break;
                    case 3:
                        bool10 = bool29;
                        bool24 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.f18123a, bool24);
                        i3 |= 8;
                        str12 = str12;
                        list12 = list12;
                        bool25 = bool25;
                        bool23 = bool10;
                        break;
                    case 4:
                        bool10 = bool29;
                        bool25 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.f18123a, bool25);
                        i3 |= 16;
                        str12 = str12;
                        list12 = list12;
                        bool26 = bool26;
                        bool23 = bool10;
                        break;
                    case 5:
                        bool10 = bool29;
                        bool26 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.f18123a, bool26);
                        i3 |= 32;
                        str12 = str12;
                        list12 = list12;
                        bool27 = bool27;
                        bool23 = bool10;
                        break;
                    case 6:
                        bool10 = bool29;
                        bool27 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.f18123a, bool27);
                        i3 |= 64;
                        str12 = str12;
                        list12 = list12;
                        bool23 = bool10;
                        break;
                    case 7:
                        bool10 = bool29;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str17);
                        i3 |= 128;
                        str12 = str12;
                        list12 = list12;
                        bool28 = bool28;
                        bool23 = bool10;
                        break;
                    case 8:
                        bool10 = bool29;
                        bool28 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.f18123a, bool28);
                        i3 |= 256;
                        str12 = str12;
                        list12 = list12;
                        num9 = num9;
                        bool23 = bool10;
                        break;
                    case 9:
                        bool10 = bool29;
                        num9 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.f18146a, num9);
                        i3 |= 512;
                        str12 = str12;
                        list12 = list12;
                        bool23 = bool10;
                        break;
                    case 10:
                        bool23 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.f18123a, bool29);
                        i3 |= 1024;
                        str12 = str12;
                        list12 = list12;
                        break;
                    case 11:
                        bool20 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.f18123a, bool20);
                        i3 |= 2048;
                        str12 = str12;
                        bool23 = bool29;
                        break;
                    case 12:
                        bool20 = bool20;
                        list14 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, (DeserializationStrategy) lazyArr[12].getValue(), list14);
                        i3 |= 4096;
                        bool23 = bool29;
                        bool20 = bool20;
                        break;
                    case 13:
                        bool20 = bool20;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), list6);
                        i3 |= 8192;
                        bool23 = bool29;
                        bool20 = bool20;
                        break;
                    case 14:
                        bool20 = bool20;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str12);
                        i3 |= 16384;
                        bool23 = bool29;
                        bool20 = bool20;
                        break;
                    case 15:
                        bool22 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.f18123a, bool22);
                        i2 = 32768;
                        i3 |= i2;
                        bool23 = bool29;
                        bool20 = bool20;
                        break;
                    case 16:
                        bool21 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.f18123a, bool21);
                        i2 = 65536;
                        i3 |= i2;
                        bool23 = bool29;
                        bool20 = bool20;
                        break;
                    case 17:
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.f18146a, num7);
                        i2 = 131072;
                        i3 |= i2;
                        bool23 = bool29;
                        bool20 = bool20;
                        break;
                    case 18:
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.f18146a, num8);
                        i2 = 262144;
                        i3 |= i2;
                        bool23 = bool29;
                        bool20 = bool20;
                        break;
                    case 19:
                        list12 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, (DeserializationStrategy) lazyArr[19].getValue(), list12);
                        i2 = 524288;
                        i3 |= i2;
                        bool23 = bool29;
                        bool20 = bool20;
                        break;
                    case 20:
                        bool20 = bool20;
                        list13 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, (DeserializationStrategy) lazyArr[20].getValue(), list13);
                        i3 |= 1048576;
                        bool23 = bool29;
                        bool20 = bool20;
                        break;
                    case 21:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.f18170a, str14);
                        i2 = 2097152;
                        i3 |= i2;
                        bool23 = bool29;
                        bool20 = bool20;
                        break;
                    case 22:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.f18170a, str13);
                        i2 = 4194304;
                        i3 |= i2;
                        bool23 = bool29;
                        bool20 = bool20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str15;
            str2 = str17;
            num = num7;
            bool = bool20;
            list = list13;
            bool2 = bool21;
            num2 = num8;
            list2 = list6;
            bool3 = bool22;
            list3 = list14;
            str3 = str13;
            str4 = str14;
            str5 = str12;
            list4 = list12;
            str6 = str16;
            list5 = list15;
            bool4 = bool24;
            bool5 = bool25;
            bool6 = bool26;
            bool7 = bool27;
            i = i3;
            bool8 = bool28;
            num3 = num9;
            bool9 = bool23;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RouteStaticDataApiModel(i, str, str6, list5, bool4, bool5, bool6, bool7, str2, bool8, num3, bool9, bool, list3, list2, str5, bool3, bool2, num, num2, list4, list, str4, str3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:125:0x020e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0226  */
    /* JADX WARN: Code duplicated, block: B:135:0x0238  */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        Boolean bool;
        RouteStaticDataApiModel value = (RouteStaticDataApiModel) obj;
        Intrinsics.i(value, "value");
        String str = value.w;
        String str2 = value.v;
        List list = value.u;
        List list2 = value.t;
        Integer num = value.s;
        Integer num2 = value.r;
        Boolean bool2 = value.q;
        Boolean bool3 = value.p;
        String str3 = value.o;
        List list3 = value.n;
        List list4 = value.m;
        Boolean bool4 = value.l;
        Boolean bool5 = value.k;
        Integer num3 = value.j;
        Boolean bool6 = value.i;
        String str4 = value.h;
        Boolean bool7 = value.g;
        Boolean bool8 = value.f;
        Boolean bool9 = value.e;
        Boolean bool10 = value.d;
        List list5 = value.c;
        String str5 = value.b;
        String str6 = value.f1680a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RouteStaticDataApiModel.x;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str6 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || list5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), list5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.d(bool10, Boolean.FALSE)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.f18123a, bool10);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.d(bool9, Boolean.FALSE)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.f18123a, bool9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.d(bool8, Boolean.FALSE)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.f18123a, bool8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.d(bool7, Boolean.FALSE)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.f18123a, bool7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.d(bool6, Boolean.FALSE)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.f18123a, bool6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || num3 == null || num3.intValue() != 0) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.f18146a, num3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.d(bool5, Boolean.FALSE)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.f18123a, bool5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.d(bool4, Boolean.FALSE)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.f18123a, bool4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || list4 != 0) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 12, (SerializationStrategy) lazyArr[12].getValue(), list4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || list3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 13, (SerializationStrategy) lazyArr[13].getValue(), list3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || bool3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.f18123a, bool3);
        }
        if (!compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16)) {
            bool = bool2;
            if (!Intrinsics.d(bool, Boolean.FALSE)) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17) || num2 == null || num2.intValue() != 0) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.f18146a, num2);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18) || num == null || num.intValue() != 0) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.f18146a, num);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19) || list2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, (SerializationStrategy) lazyArr[19].getValue(), list2);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20) || list != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21) || str2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.f18170a, str2);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22) || str != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.f18170a, str);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        bool = bool2;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, BooleanSerializer.f18123a, bool);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.f18146a, num2);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.f18146a, num2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.f18146a, num);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, IntSerializer.f18146a, num);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, (SerializationStrategy) lazyArr[19].getValue(), list2);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, (SerializationStrategy) lazyArr[19].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.f18170a, str2);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.f18170a, str);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
