package app.chalo.citydata.repository.local.room.entity;

import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/citydata/repository/local/room/entity/RouteEntityDetailedData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/citydata/repository/local/room/entity/RouteEntityDetailedData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RouteEntityDetailedData$$serializer implements GeneratedSerializer<RouteEntityDetailedData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RouteEntityDetailedData$$serializer f1785a;
    private static final SerialDescriptor descriptor;

    static {
        RouteEntityDetailedData$$serializer routeEntityDetailedData$$serializer = new RouteEntityDetailedData$$serializer();
        f1785a = routeEntityDetailedData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.citydata.repository.local.room.entity.RouteEntityDetailedData", routeEntityDetailedData$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("transitMode", false);
        pluginGeneratedSerialDescriptor.j("stopsList", false);
        pluginGeneratedSerialDescriptor.j("routeTiming", false);
        pluginGeneratedSerialDescriptor.j("isFreeRideAvailable", false);
        pluginGeneratedSerialDescriptor.j("isRouteDisrupted", false);
        pluginGeneratedSerialDescriptor.j("mapPolyLineString", false);
        pluginGeneratedSerialDescriptor.j("liveSeatAvailabilityId", false);
        pluginGeneratedSerialDescriptor.j("isShortTripAvailable", false);
        pluginGeneratedSerialDescriptor.j("trafficSignalLocationsOnRouteList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = RouteEntityDetailedData.j;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), RouteEntityTripTimingTableModel$$serializer.f1793a, booleanSerializer, booleanSerializer, StringSerializer.f18170a, IntSerializer.f18146a, booleanSerializer, BuiltinSerializersKt.c((KSerializer) lazyArr[8].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        List list;
        ChaloTransitMode chaloTransitMode;
        List list2;
        RouteEntityTripTimingTableModel routeEntityTripTimingTableModel;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RouteEntityDetailedData.j;
        int i3 = 7;
        int i4 = 6;
        int i5 = 5;
        int i6 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ChaloTransitMode chaloTransitMode2 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            RouteEntityTripTimingTableModel routeEntityTripTimingTableModel2 = (RouteEntityTripTimingTableModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, RouteEntityTripTimingTableModel$$serializer.f1793a, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), null);
            chaloTransitMode = chaloTransitMode2;
            z = zDecodeBooleanElement3;
            i2 = iDecodeIntElement;
            str = strDecodeStringElement;
            z2 = zDecodeBooleanElement;
            z3 = zDecodeBooleanElement2;
            routeEntityTripTimingTableModel = routeEntityTripTimingTableModel2;
            i = 511;
            list = list3;
        } else {
            int i7 = 1;
            boolean z4 = true;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            List list4 = null;
            RouteEntityTripTimingTableModel routeEntityTripTimingTableModel3 = null;
            ChaloTransitMode chaloTransitMode3 = null;
            List list5 = null;
            String strDecodeStringElement2 = null;
            int iDecodeIntElement2 = 0;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i4 = 6;
                        i5 = 5;
                        i7 = 1;
                        break;
                    case 0:
                        i6 |= 1;
                        chaloTransitMode3 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), chaloTransitMode3);
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        i7 = 1;
                        break;
                    case 1:
                        i6 |= 2;
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i7, (DeserializationStrategy) lazyArr[i7].getValue(), list5);
                        i3 = 7;
                        i4 = 6;
                        i5 = 5;
                        break;
                    case 2:
                        routeEntityTripTimingTableModel3 = (RouteEntityTripTimingTableModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, RouteEntityTripTimingTableModel$$serializer.f1793a, routeEntityTripTimingTableModel3);
                        i6 |= 4;
                        i3 = 7;
                        i4 = 6;
                        break;
                    case 3:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i6 |= 8;
                        break;
                    case 4:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i6 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i6 |= 32;
                        break;
                    case 6:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i4);
                        i6 |= 64;
                        break;
                    case 7:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i6 |= 128;
                        break;
                    case 8:
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, (DeserializationStrategy) lazyArr[8].getValue(), list4);
                        i6 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement4;
            list = list5;
            chaloTransitMode = chaloTransitMode3;
            list2 = list4;
            routeEntityTripTimingTableModel = routeEntityTripTimingTableModel3;
            i = i6;
            i2 = iDecodeIntElement2;
            z2 = zDecodeBooleanElement5;
            z3 = zDecodeBooleanElement6;
            str = strDecodeStringElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RouteEntityDetailedData(i, chaloTransitMode, list, routeEntityTripTimingTableModel, z2, z3, str, i2, z, list2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RouteEntityDetailedData value = (RouteEntityDetailedData) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = RouteEntityDetailedData.j;
        SerializationStrategy serializationStrategy = (SerializationStrategy) lazyArr[0].getValue();
        ChaloTransitMode chaloTransitMode = value.f1784a;
        List list = value.i;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, serializationStrategy, chaloTransitMode);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, RouteEntityTripTimingTableModel$$serializer.f1793a, value.c);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, value.d);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 6, value.g);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 7, value.h);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, (SerializationStrategy) lazyArr[8].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
