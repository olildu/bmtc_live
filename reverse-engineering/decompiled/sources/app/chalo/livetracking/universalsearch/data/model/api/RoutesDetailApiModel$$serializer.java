package app.chalo.livetracking.universalsearch.data.model.api;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.media3.common.C;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/universalsearch/data/model/api/RoutesDetailApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/universalsearch/data/model/api/RoutesDetailApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RoutesDetailApiModel$$serializer implements GeneratedSerializer<RoutesDetailApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RoutesDetailApiModel$$serializer f4986a;
    private static final SerialDescriptor descriptor;

    static {
        RoutesDetailApiModel$$serializer routesDetailApiModel$$serializer = new RoutesDetailApiModel$$serializer();
        f4986a = routesDetailApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.universalsearch.data.model.api.RoutesDetailApiModel", routesDetailApiModel$$serializer, 31);
        pluginGeneratedSerialDescriptor.j("route_id", true);
        pluginGeneratedSerialDescriptor.j("route_name", true);
        pluginGeneratedSerialDescriptor.j("transport_type", true);
        pluginGeneratedSerialDescriptor.j("first_stop_name", true);
        pluginGeneratedSerialDescriptor.j("last_stop_name", true);
        pluginGeneratedSerialDescriptor.j("direction_stop_name", true);
        pluginGeneratedSerialDescriptor.j("agency_name", true);
        pluginGeneratedSerialDescriptor.j("special_features", true);
        pluginGeneratedSerialDescriptor.j("spf", true);
        pluginGeneratedSerialDescriptor.j("stop_seq", true);
        pluginGeneratedSerialDescriptor.j("mobileTicketing", true);
        final String[] strArr = {"ticketingAllowed"};
        pluginGeneratedSerialDescriptor.k(new JsonNames() { // from class: app.chalo.livetracking.universalsearch.data.model.api.RoutesDetailApiModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0
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
        pluginGeneratedSerialDescriptor.j("mTicketEnabled", true);
        pluginGeneratedSerialDescriptor.j("routePassEnabled", true);
        pluginGeneratedSerialDescriptor.j("isFreeRide", true);
        pluginGeneratedSerialDescriptor.j("poly", true);
        final String[] strArr2 = {"polyLine"};
        pluginGeneratedSerialDescriptor.k(new JsonNames() { // from class: app.chalo.livetracking.universalsearch.data.model.api.RoutesDetailApiModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0
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
        pluginGeneratedSerialDescriptor.j("availabilityLevel", true);
        pluginGeneratedSerialDescriptor.j("isRouteDisrupted", true);
        final String[] strArr3 = {"d"};
        pluginGeneratedSerialDescriptor.k(new JsonNames() { // from class: app.chalo.livetracking.universalsearch.data.model.api.RoutesDetailApiModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0
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
        pluginGeneratedSerialDescriptor.j("seatOccupancy", true);
        final String[] strArr4 = {"so"};
        pluginGeneratedSerialDescriptor.k(new JsonNames() { // from class: app.chalo.livetracking.universalsearch.data.model.api.RoutesDetailApiModel$$serializer$annotationImpl$kotlinx_serialization_json_JsonNames$0
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
        pluginGeneratedSerialDescriptor.j("isAirportRoute", true);
        pluginGeneratedSerialDescriptor.j("isPremiumBusRoute", true);
        pluginGeneratedSerialDescriptor.j("stopSequenceWithDetails", true);
        pluginGeneratedSerialDescriptor.j("direction_stop", true);
        pluginGeneratedSerialDescriptor.j("station_type", true);
        pluginGeneratedSerialDescriptor.j("hasFrequencyTrips", true);
        pluginGeneratedSerialDescriptor.j("il", true);
        pluginGeneratedSerialDescriptor.j("shortTripEnabled", true);
        pluginGeneratedSerialDescriptor.j("ttStatus", true);
        pluginGeneratedSerialDescriptor.j("ttSid", true);
        pluginGeneratedSerialDescriptor.j("result_type", true);
        pluginGeneratedSerialDescriptor.j("via", true);
        pluginGeneratedSerialDescriptor.j("routeNamingScheme", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RoutesDetailApiModel.F;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC6 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC7 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC8 = BuiltinSerializersKt.c((KSerializer) lazyArr[7].getValue());
        KSerializer kSerializerC9 = BuiltinSerializersKt.c((KSerializer) lazyArr[8].getValue());
        KSerializer kSerializerC10 = BuiltinSerializersKt.c((KSerializer) lazyArr[9].getValue());
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        KSerializer kSerializerC11 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC12 = BuiltinSerializersKt.c((KSerializer) lazyArr[20].getValue());
        KSerializer kSerializerC13 = BuiltinSerializersKt.c(StopsInfoApiModel$$serializer.f4990a);
        KSerializer kSerializerC14 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC15 = BuiltinSerializersKt.c(booleanSerializer);
        KSerializer kSerializerC16 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC17 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC18 = BuiltinSerializersKt.c(stringSerializer);
        IntSerializer intSerializer = IntSerializer.f18146a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, kSerializerC5, kSerializerC6, kSerializerC7, kSerializerC8, kSerializerC9, kSerializerC10, booleanSerializer, booleanSerializer, booleanSerializer, booleanSerializer, kSerializerC11, LongSerializer.f18151a, booleanSerializer, intSerializer, booleanSerializer, booleanSerializer, kSerializerC12, kSerializerC13, kSerializerC14, kSerializerC15, booleanSerializer, booleanSerializer, intSerializer, intSerializer, kSerializerC16, kSerializerC17, kSerializerC18};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        List list;
        List list2;
        List list3;
        int i;
        StopsInfoApiModel stopsInfoApiModel;
        String str2;
        Boolean bool;
        List list4;
        String str3;
        String str4;
        String str5;
        boolean z;
        int i2;
        int i3;
        String str6;
        boolean z2;
        boolean z3;
        boolean z4;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        boolean z5;
        boolean z6;
        boolean z7;
        int i4;
        boolean z8;
        boolean z9;
        long j;
        String str13;
        int i5;
        int i6;
        int i7;
        int i8;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RoutesDetailApiModel.F;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), null);
            List list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, (DeserializationStrategy) lazyArr[9].getValue(), null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 15);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 17);
            boolean zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
            boolean zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
            List list8 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, (DeserializationStrategy) lazyArr[20].getValue(), null);
            StopsInfoApiModel stopsInfoApiModel2 = (StopsInfoApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, StopsInfoApiModel$$serializer.f4990a, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, stringSerializer, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, BooleanSerializer.f18123a, null);
            boolean zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 24);
            boolean zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 25);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 26);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 27);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 28, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 29, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 30, stringSerializer, null);
            i = Integer.MAX_VALUE;
            list4 = list5;
            list2 = list6;
            z3 = zDecodeBooleanElement9;
            z4 = zDecodeBooleanElement5;
            z5 = zDecodeBooleanElement2;
            list3 = list7;
            str5 = str20;
            str10 = str19;
            str8 = str17;
            z9 = zDecodeBooleanElement;
            str9 = str18;
            str12 = str24;
            z2 = zDecodeBooleanElement8;
            i3 = iDecodeIntElement3;
            i2 = iDecodeIntElement2;
            bool = bool2;
            str11 = str23;
            stopsInfoApiModel = stopsInfoApiModel2;
            str2 = str22;
            str7 = str16;
            z8 = zDecodeBooleanElement6;
            i4 = iDecodeIntElement;
            str4 = str21;
            str6 = str15;
            z = zDecodeBooleanElement7;
            str = str14;
            z7 = zDecodeBooleanElement4;
            z6 = zDecodeBooleanElement3;
            list = list8;
            j = jDecodeLongElement;
        } else {
            int i9 = 0;
            List list9 = null;
            boolean z10 = true;
            String str25 = null;
            String str26 = null;
            Boolean bool3 = null;
            List list10 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            int i10 = 7;
            int i11 = 8;
            boolean zDecodeBooleanElement10 = false;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            boolean zDecodeBooleanElement11 = false;
            boolean zDecodeBooleanElement12 = false;
            boolean zDecodeBooleanElement13 = false;
            boolean zDecodeBooleanElement14 = false;
            boolean zDecodeBooleanElement15 = false;
            boolean zDecodeBooleanElement16 = false;
            int iDecodeIntElement6 = 0;
            boolean zDecodeBooleanElement17 = false;
            boolean zDecodeBooleanElement18 = false;
            long jDecodeLongElement2 = 0;
            int i12 = 9;
            List list11 = null;
            List list12 = null;
            StopsInfoApiModel stopsInfoApiModel3 = null;
            String str35 = null;
            String str36 = null;
            while (z10) {
                String str37 = str29;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str31 = str31;
                        str13 = str32;
                        z10 = false;
                        str27 = str27;
                        str29 = str37;
                        str26 = str26;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 0:
                        i9 |= 1;
                        str31 = str31;
                        str13 = str32;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str30);
                        str27 = str27;
                        str29 = str37;
                        str26 = str26;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 1:
                        str25 = str25;
                        str33 = str33;
                        str34 = str34;
                        i9 |= 2;
                        str27 = str27;
                        str13 = str32;
                        str29 = str37;
                        str26 = str26;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str31);
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 2:
                        str25 = str25;
                        str34 = str34;
                        str33 = str33;
                        i9 |= 4;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str32);
                        str27 = str27;
                        str29 = str37;
                        str26 = str26;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 3:
                        str25 = str25;
                        str34 = str34;
                        i9 |= 8;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str33);
                        str27 = str27;
                        str29 = str37;
                        str26 = str26;
                        str13 = str32;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 4:
                        str25 = str25;
                        i9 |= 16;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str34);
                        str27 = str27;
                        str29 = str37;
                        str26 = str26;
                        str13 = str32;
                        str33 = str33;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 5:
                        str25 = str25;
                        i9 |= 32;
                        str27 = str27;
                        str26 = str26;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str37);
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 6:
                        str25 = str25;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str27);
                        i9 |= 64;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 7:
                        str27 = str27;
                        list10 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i10, (DeserializationStrategy) lazyArr[i10].getValue(), list10);
                        i9 |= 128;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 8:
                        str27 = str27;
                        list11 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i11, (DeserializationStrategy) lazyArr[i11].getValue(), list11);
                        i9 |= 256;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 9:
                        str27 = str27;
                        list12 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i12, (DeserializationStrategy) lazyArr[i12].getValue(), list12);
                        i9 |= 512;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 10:
                        str27 = str27;
                        zDecodeBooleanElement18 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                        i9 |= 1024;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 11:
                        str27 = str27;
                        zDecodeBooleanElement14 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i9 |= 2048;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 12:
                        str27 = str27;
                        i9 |= 4096;
                        str25 = str25;
                        zDecodeBooleanElement15 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 13:
                        str27 = str27;
                        i9 |= 8192;
                        str25 = str25;
                        zDecodeBooleanElement16 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 14:
                        str27 = str27;
                        i9 |= 16384;
                        str25 = str25;
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str36);
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 15:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 15);
                        i5 = 32768;
                        i9 |= i5;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 16:
                        zDecodeBooleanElement13 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
                        i5 = 65536;
                        i9 |= i5;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 17:
                        str27 = str27;
                        i9 |= 131072;
                        str25 = str25;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 17);
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 18:
                        str27 = str27;
                        i9 |= 262144;
                        str25 = str25;
                        zDecodeBooleanElement17 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 19:
                        str27 = str27;
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
                        i9 |= 524288;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 20:
                        list9 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 20, (DeserializationStrategy) lazyArr[20].getValue(), list9);
                        i6 = 1048576;
                        i9 |= i6;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 21:
                        stopsInfoApiModel3 = (StopsInfoApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 21, StopsInfoApiModel$$serializer.f4990a, stopsInfoApiModel3);
                        i7 = 2097152;
                        i9 |= i7;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 22:
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.f18170a, str35);
                        i7 = 4194304;
                        i9 |= i7;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 23:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 23, BooleanSerializer.f18123a, bool3);
                        i7 = 8388608;
                        i9 |= i7;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 24:
                        zDecodeBooleanElement11 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 24);
                        i8 = 16777216;
                        i9 |= i8;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 25:
                        zDecodeBooleanElement12 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 25);
                        i8 = 33554432;
                        i9 |= i8;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 26:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 26);
                        i8 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        i9 |= i8;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 27:
                        str27 = str27;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 27);
                        i9 |= C.BUFFER_FLAG_FIRST_SAMPLE;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 28:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.f18170a, str26);
                        i6 = 268435456;
                        i9 |= i6;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 29:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.f18170a, str25);
                        i6 = 536870912;
                        i9 |= i6;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    case 30:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.f18170a, str28);
                        i6 = 1073741824;
                        i9 |= i6;
                        str25 = str25;
                        str13 = str32;
                        str33 = str33;
                        str34 = str34;
                        str29 = str37;
                        str27 = str27;
                        str32 = str13;
                        str33 = str33;
                        str34 = str34;
                        str25 = str25;
                        i10 = 7;
                        i11 = 8;
                        i12 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str30;
            list = list9;
            list2 = list11;
            list3 = list12;
            i = i9;
            stopsInfoApiModel = stopsInfoApiModel3;
            str2 = str35;
            bool = bool3;
            list4 = list10;
            str3 = str28;
            str4 = str36;
            str5 = str27;
            z = zDecodeBooleanElement10;
            i2 = iDecodeIntElement4;
            i3 = iDecodeIntElement5;
            str6 = str31;
            z2 = zDecodeBooleanElement11;
            z3 = zDecodeBooleanElement12;
            z4 = zDecodeBooleanElement13;
            str7 = str32;
            str8 = str33;
            str9 = str34;
            str10 = str29;
            str11 = str26;
            str12 = str25;
            z5 = zDecodeBooleanElement14;
            z6 = zDecodeBooleanElement15;
            z7 = zDecodeBooleanElement16;
            i4 = iDecodeIntElement6;
            z8 = zDecodeBooleanElement17;
            z9 = zDecodeBooleanElement18;
            j = jDecodeLongElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RoutesDetailApiModel(i, str, str6, str7, str8, str9, str10, str5, list4, list2, list3, z9, z5, z6, z7, str4, j, z4, i4, z8, z, list, stopsInfoApiModel, str2, bool, z2, z3, i2, i3, str11, str12, str3);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0237  */
    /* JADX WARN: Code duplicated, block: B:146:0x0248  */
    /* JADX WARN: Code duplicated, block: B:152:0x0259  */
    /* JADX WARN: Code duplicated, block: B:160:0x026d  */
    /* JADX WARN: Code duplicated, block: B:165:0x027f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0291  */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        boolean z;
        RoutesDetailApiModel value = (RoutesDetailApiModel) obj;
        Intrinsics.i(value, "value");
        String str = value.E;
        String str2 = value.D;
        String str3 = value.C;
        int i = value.B;
        int i2 = value.A;
        boolean z2 = value.z;
        boolean z3 = value.y;
        Boolean bool = value.x;
        String str4 = value.w;
        StopsInfoApiModel stopsInfoApiModel = value.v;
        List list = value.u;
        boolean z4 = value.t;
        boolean z5 = value.s;
        int i3 = value.r;
        boolean z6 = value.q;
        long j = value.p;
        String str5 = value.o;
        boolean z7 = value.n;
        boolean z8 = value.m;
        boolean z9 = value.l;
        boolean z10 = value.k;
        List list2 = value.j;
        List list3 = value.i;
        List list4 = value.h;
        String str6 = value.g;
        String str7 = value.f;
        String str8 = value.e;
        String str9 = value.d;
        String str10 = value.c;
        String str11 = value.b;
        String str12 = value.f4985a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RoutesDetailApiModel.F;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str12 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str12);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str11 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str11);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || str10 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str10);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || str9 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || str8 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || str7 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || str6 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || list4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), list4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || list3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, (SerializationStrategy) lazyArr[8].getValue(), list3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || list2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, (SerializationStrategy) lazyArr[9].getValue(), list2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || z10) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 10, z10);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 11) || z9) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 11, z9);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 12) || z8 != 0) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 12, z8);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 13) || z7) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 13, z7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 14) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.f18170a, str5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 15) || j != 2) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 15, j);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 16) || z6) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 16, z6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17) || i3 != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 17, i3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18) || z5) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 18, z5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19) || z4) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 19, z4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 20) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 20, (SerializationStrategy) lazyArr[20].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 21) || stopsInfoApiModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 21, StopsInfoApiModel$$serializer.f4990a, stopsInfoApiModel);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 22) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 23) || bool != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 23, BooleanSerializer.f18123a, bool);
        }
        if (!compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 24)) {
            z = z3;
            if (!z) {
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 25) || z2) {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 25, z2);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 26) || i2 != 0) {
                compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 26, i2);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 27) || i != 0) {
                compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 27, i);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 28) || str3 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.f18170a, str3);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29) || str2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.f18170a, str2);
            }
            if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 30) || str != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.f18170a, str);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
        z = z3;
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 24, z);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 25)) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 25, z2);
        } else {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 25, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 26)) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 26, i2);
        } else {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 26, i2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 27)) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 27, i);
        } else {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 27, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 28)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.f18170a, str3);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 29)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.f18170a, str2);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 30)) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.f18170a, str);
        } else {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
