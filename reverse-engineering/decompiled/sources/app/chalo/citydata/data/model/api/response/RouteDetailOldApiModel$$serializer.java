package app.chalo.citydata.data.model.api.response;

import defpackage.vo1;
import java.util.Arrays;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonNames;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/citydata/data/model/api/response/RouteDetailOldApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/citydata/data/model/api/response/RouteDetailOldApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RouteDetailOldApiModel$$serializer implements GeneratedSerializer<RouteDetailOldApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RouteDetailOldApiModel$$serializer f1671a;
    private static final SerialDescriptor descriptor;

    static {
        RouteDetailOldApiModel$$serializer routeDetailOldApiModel$$serializer = new RouteDetailOldApiModel$$serializer();
        f1671a = routeDetailOldApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.citydata.data.model.api.response.RouteDetailOldApiModel", routeDetailOldApiModel$$serializer, 26);
        pluginGeneratedSerialDescriptor.j("route_id", true);
        pluginGeneratedSerialDescriptor.j("route_name", true);
        pluginGeneratedSerialDescriptor.j("transport_type", true);
        pluginGeneratedSerialDescriptor.j("agency_name", true);
        pluginGeneratedSerialDescriptor.j("special_features", true);
        pluginGeneratedSerialDescriptor.j("spf", true);
        pluginGeneratedSerialDescriptor.j("ticketingAllowed", true);
        pluginGeneratedSerialDescriptor.j("mTicketEnabled", true);
        pluginGeneratedSerialDescriptor.j("routePassEnabled", true);
        pluginGeneratedSerialDescriptor.j("isFreeRide", true);
        pluginGeneratedSerialDescriptor.j("polyLine", true);
        final String[] strArr = {"polyline"};
        pluginGeneratedSerialDescriptor.k(new JsonNames() { // from class: app.chalo.citydata.data.model.api.response.RouteDetailOldApiModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0
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
        pluginGeneratedSerialDescriptor.j("availabilityLevel", true);
        pluginGeneratedSerialDescriptor.j("d", true);
        pluginGeneratedSerialDescriptor.j("so", true);
        pluginGeneratedSerialDescriptor.j("isAirportRoute", true);
        pluginGeneratedSerialDescriptor.j("isPremiumBusRoute", true);
        pluginGeneratedSerialDescriptor.j("stopSequenceWithDetails", true);
        pluginGeneratedSerialDescriptor.j("direction_stop", true);
        pluginGeneratedSerialDescriptor.j("station_type", true);
        pluginGeneratedSerialDescriptor.j("hasFrequencyTrips", true);
        pluginGeneratedSerialDescriptor.j("shortTripEnabled", true);
        pluginGeneratedSerialDescriptor.j("ttStatus", true);
        pluginGeneratedSerialDescriptor.j("ttSid", true);
        pluginGeneratedSerialDescriptor.j("via", true);
        pluginGeneratedSerialDescriptor.j("routeNamingScheme", true);
        pluginGeneratedSerialDescriptor.j("trafficSignals", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RouteDetailOldApiModel.A;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c((KSerializer) lazyArr[4].getValue());
        KSerializer kSerializerC6 = BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue());
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        KSerializer kSerializerC7 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC8 = BuiltinSerializersKt.c((KSerializer) lazyArr[16].getValue());
        KSerializer kSerializerC9 = BuiltinSerializersKt.c(StopApiModel$$serializer.f1694a);
        KSerializer kSerializerC10 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC11 = BuiltinSerializersKt.c(booleanSerializer);
        KSerializer kSerializerC12 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC13 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC14 = BuiltinSerializersKt.c((KSerializer) lazyArr[25].getValue());
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, kSerializerC7, LongSerializer.f18151a, booleanSerializer, intSerializer, booleanSerializer, booleanSerializer, kSerializerC8, kSerializerC9, kSerializerC10, kSerializerC11, booleanSerializer, intSerializer, intSerializer, kSerializerC12, kSerializerC13, kSerializerC14};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        Boolean bool;
        StopApiModel stopApiModel;
        List list;
        List list2;
        String str3;
        String str4;
        String str5;
        List list3;
        List list4;
        String str6;
        String str7;
        String str8;
        int i;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RouteDetailOldApiModel.A;
        int iDecodeIntElement = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 11);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
            boolean zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            boolean zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
            List list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, (DeserializationStrategy) lazyArr[16].getValue(), null);
            StopApiModel stopApiModel2 = (StopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StopApiModel$$serializer.f1694a, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.f18123a, null);
            boolean zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 20);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 21);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 22);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, stringSerializer, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, stringSerializer, null);
            list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, (DeserializationStrategy) lazyArr[25].getValue(), null);
            i = 67108863;
            z2 = zDecodeBooleanElement8;
            list2 = list5;
            z5 = zDecodeBooleanElement4;
            z6 = zDecodeBooleanElement2;
            z7 = zDecodeBooleanElement;
            str4 = str12;
            z8 = zDecodeBooleanElement3;
            str6 = str11;
            list3 = list6;
            str5 = str13;
            i3 = iDecodeIntElement3;
            str7 = str10;
            i4 = iDecodeIntElement4;
            bool = bool2;
            str8 = str15;
            stopApiModel = stopApiModel2;
            str3 = str14;
            z = zDecodeBooleanElement5;
            z3 = zDecodeBooleanElement6;
            str = str9;
            i2 = iDecodeIntElement2;
            z4 = zDecodeBooleanElement7;
            list = list7;
            j = jDecodeLongElement;
        } else {
            int i7 = 0;
            List list8 = null;
            boolean z9 = true;
            boolean zDecodeBooleanElement9 = false;
            boolean zDecodeBooleanElement10 = false;
            int iDecodeIntElement5 = 0;
            boolean zDecodeBooleanElement11 = false;
            boolean zDecodeBooleanElement12 = false;
            boolean zDecodeBooleanElement13 = false;
            boolean zDecodeBooleanElement14 = false;
            boolean zDecodeBooleanElement15 = false;
            boolean zDecodeBooleanElement16 = false;
            int iDecodeIntElement6 = 0;
            long jDecodeLongElement2 = 0;
            int i8 = 5;
            int i9 = 4;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            Boolean bool3 = null;
            StopApiModel stopApiModel3 = null;
            List list9 = null;
            List list10 = null;
            String str19 = null;
            String str20 = null;
            String str21 = null;
            List list11 = null;
            String str22 = null;
            String str23 = null;
            while (z9) {
                iDecodeIntElement = iDecodeIntElement;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z9 = false;
                        str17 = str17;
                        i7 = i7;
                        i9 = 4;
                        i8 = 5;
                        break;
                    case 0:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str22);
                        i7 |= 1;
                        str16 = str16;
                        str23 = str23;
                        str17 = str17;
                        i9 = 4;
                        i8 = 5;
                        break;
                    case 1:
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str23);
                        i7 |= 2;
                        str16 = str16;
                        str17 = str17;
                        i9 = 4;
                        i8 = 5;
                        break;
                    case 2:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str16);
                        i7 |= 4;
                        i9 = 4;
                        i8 = 5;
                        break;
                    case 3:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str20);
                        i7 |= 8;
                        str16 = str16;
                        i9 = 4;
                        i8 = 5;
                        break;
                    case 4:
                        list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i9, (DeserializationStrategy) lazyArr[i9].getValue(), list10);
                        i7 |= 16;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        i8 = 5;
                        break;
                    case 5:
                        str16 = str16;
                        list11 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i8, (DeserializationStrategy) lazyArr[i8].getValue(), list11);
                        i7 |= 32;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 6:
                        str16 = str16;
                        zDecodeBooleanElement15 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i7 |= 64;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 7:
                        str16 = str16;
                        zDecodeBooleanElement14 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i7 |= 128;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 8:
                        str16 = str16;
                        zDecodeBooleanElement16 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i7 |= 256;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 9:
                        str16 = str16;
                        zDecodeBooleanElement13 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i7 |= 512;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 10:
                        str16 = str16;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str21);
                        i7 |= 1024;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 11:
                        str16 = str16;
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 11);
                        i7 |= 2048;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 12:
                        str16 = str16;
                        zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i7 |= 4096;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 13:
                        str16 = str16;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
                        i7 |= 8192;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 14:
                        str16 = str16;
                        zDecodeBooleanElement11 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
                        i7 |= 16384;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 15:
                        str16 = str16;
                        zDecodeBooleanElement12 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
                        i7 |= 32768;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 16:
                        str16 = str16;
                        list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, (DeserializationStrategy) lazyArr[16].getValue(), list9);
                        i7 |= 65536;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 17:
                        stopApiModel3 = (StopApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StopApiModel$$serializer.f1694a, stopApiModel3);
                        i5 = 131072;
                        i7 |= i5;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 18:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str19);
                        i5 = 262144;
                        i7 |= i5;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 19:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.f18123a, bool3);
                        i5 = 524288;
                        i7 |= i5;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 20:
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 20);
                        i6 = 1048576;
                        i7 |= i6;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 21:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 21);
                        i6 = 2097152;
                        i7 |= i6;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 22:
                        str16 = str16;
                        i7 |= 4194304;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 22);
                        str16 = str16;
                        break;
                    case 23:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.f18170a, str17);
                        i5 = 8388608;
                        i7 |= i5;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 24:
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.f18170a, str18);
                        i5 = 16777216;
                        i7 |= i5;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    case 25:
                        list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 25, (DeserializationStrategy) lazyArr[25].getValue(), list8);
                        i5 = 33554432;
                        i7 |= i5;
                        iDecodeIntElement = iDecodeIntElement;
                        str16 = str16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str22;
            str2 = str18;
            bool = bool3;
            stopApiModel = stopApiModel3;
            list = list9;
            list2 = list10;
            str3 = str19;
            str4 = str20;
            str5 = str21;
            list3 = list11;
            list4 = list8;
            str6 = str16;
            str7 = str23;
            str8 = str17;
            i = i7;
            z = zDecodeBooleanElement9;
            z2 = zDecodeBooleanElement10;
            i2 = iDecodeIntElement5;
            z3 = zDecodeBooleanElement11;
            z4 = zDecodeBooleanElement12;
            z5 = zDecodeBooleanElement13;
            z6 = zDecodeBooleanElement14;
            z7 = zDecodeBooleanElement15;
            z8 = zDecodeBooleanElement16;
            i3 = iDecodeIntElement6;
            j = jDecodeLongElement2;
            i4 = iDecodeIntElement;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RouteDetailOldApiModel(i, str, str7, str6, str4, list2, list3, z7, z6, z8, z5, str5, j, z, i2, z3, z4, list, stopApiModel, str3, bool, z2, i3, i4, str8, str2, list4);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RouteDetailOldApiModel value = (RouteDetailOldApiModel) obj;
        Intrinsics.i(value, "value");
        List list = value.z;
        String str = value.y;
        String str2 = value.x;
        int i = value.w;
        int i2 = value.v;
        boolean z = value.u;
        Boolean bool = value.t;
        String str3 = value.s;
        StopApiModel stopApiModel = value.r;
        List list2 = value.q;
        boolean z2 = value.p;
        boolean z3 = value.o;
        int i3 = value.n;
        boolean z4 = value.m;
        long j = value.l;
        String str4 = value.k;
        boolean z5 = value.j;
        boolean z6 = value.i;
        boolean z7 = value.h;
        boolean z8 = value.g;
        List list3 = value.f;
        List list4 = value.e;
        String str5 = value.d;
        String str6 = value.c;
        String str7 = value.b;
        String str8 = value.f1670a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RouteDetailOldApiModel.A;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str8 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str7 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || str6 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || list4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), list4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || list3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), list3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || z8) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, z8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || z7) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, z7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || z6) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, z6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || z5) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 9, z5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || j != 2) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 11, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || z4) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 12, z4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || i3 != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 13, i3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 14, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 15, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16) || list2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 16, (SerializationStrategy) lazyArr[16].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17) || stopApiModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 17, StopApiModel$$serializer.f1694a, stopApiModel);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19) || bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 19, BooleanSerializer.f18123a, bool);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 20, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21) || i2 != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 21, i2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22) || i != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 22, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 23) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 24) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 25) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 25, (SerializationStrategy) lazyArr[25].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
