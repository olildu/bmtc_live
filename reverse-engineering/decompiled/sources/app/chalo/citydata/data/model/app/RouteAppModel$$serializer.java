package app.chalo.citydata.data.model.app;

import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/citydata/data/model/app/RouteAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/citydata/data/model/app/RouteAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RouteAppModel$$serializer implements GeneratedSerializer<RouteAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RouteAppModel$$serializer f1710a;
    private static final SerialDescriptor descriptor;

    static {
        RouteAppModel$$serializer routeAppModel$$serializer = new RouteAppModel$$serializer();
        f1710a = routeAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.citydata.data.model.app.RouteAppModel", routeAppModel$$serializer, 20);
        pluginGeneratedSerialDescriptor.j("version", false);
        pluginGeneratedSerialDescriptor.j("routeId", false);
        pluginGeneratedSerialDescriptor.j("routeName", false);
        pluginGeneratedSerialDescriptor.j("transitMode", false);
        pluginGeneratedSerialDescriptor.j("stopsList", false);
        pluginGeneratedSerialDescriptor.j("fromStopName", true);
        pluginGeneratedSerialDescriptor.j("endStopName", true);
        pluginGeneratedSerialDescriptor.j("endStop", false);
        pluginGeneratedSerialDescriptor.j("routeTiming", false);
        pluginGeneratedSerialDescriptor.j("agencyName", false);
        pluginGeneratedSerialDescriptor.j("isFreeRideAvailable", false);
        pluginGeneratedSerialDescriptor.j("isRouteDisrupted", false);
        pluginGeneratedSerialDescriptor.j("mapPolyLineString", false);
        pluginGeneratedSerialDescriptor.j("specialFeature", false);
        pluginGeneratedSerialDescriptor.j("liveSeatAvailabilityApplicable", false);
        pluginGeneratedSerialDescriptor.j("routeLiveDetails", false);
        pluginGeneratedSerialDescriptor.j("isShortTripAvailable", false);
        pluginGeneratedSerialDescriptor.j("trafficSignalLocationsOnRouteList", true);
        pluginGeneratedSerialDescriptor.j("via", true);
        pluginGeneratedSerialDescriptor.j("routeNamingSchemeType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RouteAppModel.u;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{IntSerializer.f18146a, stringSerializer, stringSerializer, lazyArr[3].getValue(), lazyArr[4].getValue(), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), StopAppModel$$serializer.f1728a, RouteTripTimingAppModel$$serializer.f1723a, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer, lazyArr[13].getValue(), lazyArr[14].getValue(), RouteLiveDetailsAppModel$$serializer.f1714a, booleanSerializer, lazyArr[17].getValue(), BuiltinSerializersKt.c(stringSerializer), lazyArr[19].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        String str;
        List list;
        ChaloTransitMode chaloTransitMode;
        StopAppModel stopAppModel;
        String str2;
        String str3;
        int i;
        List list2;
        LiveSeatAvailabilityApplicable liveSeatAvailabilityApplicable;
        List list3;
        RouteTripTimingAppModel routeTripTimingAppModel;
        RouteLiveDetailsAppModel routeLiveDetailsAppModel;
        String str4;
        String str5;
        String str6;
        boolean z;
        String str7;
        int i2;
        RouteNamingSchemeType routeNamingSchemeType;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RouteAppModel.u;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            ChaloTransitMode chaloTransitMode2 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            StopAppModel stopAppModel2 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, StopAppModel$$serializer.f1728a, null);
            RouteTripTimingAppModel routeTripTimingAppModel2 = (RouteTripTimingAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, RouteTripTimingAppModel$$serializer.f1723a, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            List list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), null);
            LiveSeatAvailabilityApplicable liveSeatAvailabilityApplicable2 = (LiveSeatAvailabilityApplicable) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, (DeserializationStrategy) lazyArr[14].getValue(), null);
            RouteLiveDetailsAppModel routeLiveDetailsAppModel2 = (RouteLiveDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, RouteLiveDetailsAppModel$$serializer.f1714a, null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
            str5 = strDecodeStringElement2;
            list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, (DeserializationStrategy) lazyArr[17].getValue(), null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            list = list4;
            chaloTransitMode = chaloTransitMode2;
            routeNamingSchemeType = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 19, (DeserializationStrategy) lazyArr[19].getValue(), null);
            z = zDecodeBooleanElement2;
            stopAppModel = stopAppModel2;
            str6 = strDecodeStringElement3;
            routeTripTimingAppModel = routeTripTimingAppModel2;
            str2 = str9;
            str4 = str8;
            i = 1048575;
            z2 = zDecodeBooleanElement;
            z3 = zDecodeBooleanElement3;
            routeLiveDetailsAppModel = routeLiveDetailsAppModel2;
            liveSeatAvailabilityApplicable = liveSeatAvailabilityApplicable2;
            str = strDecodeStringElement;
            i2 = iDecodeIntElement;
            str7 = strDecodeStringElement4;
            list3 = list5;
        } else {
            RouteNamingSchemeType routeNamingSchemeType2 = null;
            int i5 = 19;
            boolean z4 = true;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            int iDecodeIntElement2 = 0;
            int i6 = 0;
            boolean zDecodeBooleanElement6 = false;
            int i7 = 4;
            List list6 = null;
            ChaloTransitMode chaloTransitMode3 = null;
            StopAppModel stopAppModel3 = null;
            String str10 = null;
            String strDecodeStringElement5 = null;
            List list7 = null;
            LiveSeatAvailabilityApplicable liveSeatAvailabilityApplicable3 = null;
            List list8 = null;
            RouteTripTimingAppModel routeTripTimingAppModel3 = null;
            RouteLiveDetailsAppModel routeLiveDetailsAppModel3 = null;
            String str11 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String str12 = null;
            while (z4) {
                int i8 = i5;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        i3 = i6;
                        z4 = false;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i7 = 4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 0:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i3 = i6 | 1;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i7 = 4;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 1:
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        int i9 = i6;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i3 = i9 | 2;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i7 = 4;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 2:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 = i6 | 4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i7 = 4;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 3:
                        chaloTransitMode3 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), chaloTransitMode3);
                        i3 = i6 | 8;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i7 = 4;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 4:
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        int i10 = i6;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i7, (DeserializationStrategy) lazyArr[i7].getValue(), list6);
                        i3 = i10 | 16;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 5:
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        int i11 = i6;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str11);
                        i3 = i11 | 32;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 6:
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        int i12 = i6;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str10);
                        i3 = i12 | 64;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 7:
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        int i13 = i6;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        stopAppModel3 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, StopAppModel$$serializer.f1728a, stopAppModel3);
                        i3 = i13 | 128;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 8:
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        int i14 = i6;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        routeTripTimingAppModel3 = (RouteTripTimingAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, RouteTripTimingAppModel$$serializer.f1723a, routeTripTimingAppModel3);
                        i3 = i14 | 256;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 9:
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        int i15 = i6;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 = i15 | 512;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 10:
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        int i16 = i6;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                        i3 = i16 | 1024;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 11:
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        int i17 = i6;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i3 = i17 | 2048;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 12:
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        int i18 = i6;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i3 = i18 | 4096;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 13:
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        int i19 = i6;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, (DeserializationStrategy) lazyArr[13].getValue(), list8);
                        i3 = i19 | 8192;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 14:
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        int i20 = i6;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        liveSeatAvailabilityApplicable3 = (LiveSeatAvailabilityApplicable) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, (DeserializationStrategy) lazyArr[14].getValue(), liveSeatAvailabilityApplicable3);
                        i3 = i20 | 16384;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 15:
                        routeLiveDetailsAppModel3 = (RouteLiveDetailsAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, RouteLiveDetailsAppModel$$serializer.f1714a, routeLiveDetailsAppModel3);
                        i4 = 32768;
                        i3 = i6 | i4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 16:
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i6 |= 65536;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
                        break;
                    case 17:
                        list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, (DeserializationStrategy) lazyArr[17].getValue(), list7);
                        i4 = 131072;
                        i3 = i6 | i4;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        i5 = 19;
                        i6 = i3;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        break;
                    case 18:
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str12);
                        i6 = 262144 | i6;
                        routeNamingSchemeType2 = routeNamingSchemeType2;
                        strDecodeStringElement5 = strDecodeStringElement5;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        i5 = 19;
                        break;
                    case 19:
                        routeNamingSchemeType2 = (RouteNamingSchemeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i8, (DeserializationStrategy) lazyArr[i8].getValue(), routeNamingSchemeType2);
                        i6 |= 524288;
                        zDecodeBooleanElement4 = zDecodeBooleanElement4;
                        i5 = 19;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            boolean z5 = zDecodeBooleanElement4;
            str = strDecodeStringElement5;
            list = list6;
            chaloTransitMode = chaloTransitMode3;
            stopAppModel = stopAppModel3;
            str2 = str10;
            str3 = str12;
            i = i6;
            list2 = list7;
            liveSeatAvailabilityApplicable = liveSeatAvailabilityApplicable3;
            list3 = list8;
            routeTripTimingAppModel = routeTripTimingAppModel3;
            routeLiveDetailsAppModel = routeLiveDetailsAppModel3;
            str4 = str11;
            str5 = strDecodeStringElement6;
            str6 = strDecodeStringElement7;
            z = zDecodeBooleanElement5;
            str7 = strDecodeStringElement8;
            i2 = iDecodeIntElement2;
            routeNamingSchemeType = routeNamingSchemeType2;
            z2 = zDecodeBooleanElement6;
            z3 = z5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RouteAppModel(i, i2, str, str5, chaloTransitMode, list, str4, str2, stopAppModel, routeTripTimingAppModel, str6, z2, z, str7, list3, liveSeatAvailabilityApplicable, routeLiveDetailsAppModel, z3, list2, str3, routeNamingSchemeType);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RouteAppModel value = (RouteAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RouteAppModel.u;
        int i = value.f1709a;
        RouteNamingSchemeType routeNamingSchemeType = value.t;
        String str = value.s;
        List list = value.r;
        String str2 = value.g;
        String str3 = value.f;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 0, i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), value.e);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str2);
        }
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, StopAppModel$$serializer.f1728a, value.h);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, RouteTripTimingAppModel$$serializer.f1723a, value.i);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 9, value.j);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 10, value.k);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 11, value.l);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 12, value.m);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 13, (SerializationStrategy) lazyArr[13].getValue(), value.n);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 14, (SerializationStrategy) lazyArr[14].getValue(), value.o);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 15, RouteLiveDetailsAppModel$$serializer.f1714a, value.p);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 16, value.q);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.d(list, EmptyList.f17557a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 17, (SerializationStrategy) lazyArr[17].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 18) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.f18170a, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 19) || routeNamingSchemeType != RouteNamingSchemeType.DEFAULT) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 19, (SerializationStrategy) lazyArr[19].getValue(), routeNamingSchemeType);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
