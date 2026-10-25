package app.chalo.livetracking.tripplanner.data.models.app;

import app.chalo.location.LatLng;
import app.chalo.location.LatLngSerializer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel.Taxi.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Taxi;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TripPlannerLegAppModel$Taxi$$serializer implements GeneratedSerializer<TripPlannerLegAppModel.Taxi> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TripPlannerLegAppModel$Taxi$$serializer f4670a;
    private static final SerialDescriptor descriptor;

    static {
        TripPlannerLegAppModel$Taxi$$serializer tripPlannerLegAppModel$Taxi$$serializer = new TripPlannerLegAppModel$Taxi$$serializer();
        f4670a = tripPlannerLegAppModel$Taxi$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel.Taxi", tripPlannerLegAppModel$Taxi$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("fromLatLng", false);
        pluginGeneratedSerialDescriptor.j("toLatLng", false);
        pluginGeneratedSerialDescriptor.j("travelTimeInSeconds", false);
        pluginGeneratedSerialDescriptor.j("endPlaceName", false);
        pluginGeneratedSerialDescriptor.j("polyline", false);
        pluginGeneratedSerialDescriptor.j("startPlaceName", false);
        pluginGeneratedSerialDescriptor.j("fare", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        LatLngSerializer latLngSerializer = LatLngSerializer.f5136a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(latLngSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(latLngSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(DoubleSerializer.f18137a);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(TripPlannerLegFareInfoAppResponseModel$$serializer.f4673a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel;
        LatLng latLng;
        LatLng latLng2;
        Double d;
        String str;
        String str2;
        String str3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 6;
        LatLng latLng3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LatLngSerializer latLngSerializer = LatLngSerializer.f5136a;
            LatLng latLng4 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, latLngSerializer, null);
            LatLng latLng5 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, latLngSerializer, null);
            Double d2 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.f18137a, null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            latLng2 = latLng5;
            tripPlannerLegFareInfoAppResponseModel = (TripPlannerLegFareInfoAppResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, TripPlannerLegFareInfoAppResponseModel$$serializer.f4673a, null);
            str3 = str6;
            str = str4;
            str2 = str5;
            d = d2;
            i = 127;
            latLng = latLng4;
        } else {
            boolean z = true;
            int i3 = 0;
            TripPlannerLegFareInfoAppResponseModel tripPlannerLegFareInfoAppResponseModel2 = null;
            LatLng latLng6 = null;
            Double d3 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        break;
                    case 0:
                        latLng3 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LatLngSerializer.f5136a, latLng3);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        latLng6 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LatLngSerializer.f5136a, latLng6);
                        i3 |= 2;
                        i2 = 6;
                        break;
                    case 2:
                        d3 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.f18137a, d3);
                        i3 |= 4;
                        break;
                    case 3:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str7);
                        i3 |= 8;
                        break;
                    case 4:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str8);
                        i3 |= 16;
                        break;
                    case 5:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str9);
                        i3 |= 32;
                        break;
                    case 6:
                        tripPlannerLegFareInfoAppResponseModel2 = (TripPlannerLegFareInfoAppResponseModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, TripPlannerLegFareInfoAppResponseModel$$serializer.f4673a, tripPlannerLegFareInfoAppResponseModel2);
                        i3 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            tripPlannerLegFareInfoAppResponseModel = tripPlannerLegFareInfoAppResponseModel2;
            latLng = latLng3;
            latLng2 = latLng6;
            d = d3;
            str = str7;
            str2 = str8;
            str3 = str9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TripPlannerLegAppModel.Taxi(i, latLng, latLng2, d, str, str2, str3, tripPlannerLegFareInfoAppResponseModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TripPlannerLegAppModel.Taxi value = (TripPlannerLegAppModel.Taxi) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TripPlannerLegAppModel.Taxi.Companion companion = TripPlannerLegAppModel.Taxi.INSTANCE;
        LatLngSerializer latLngSerializer = LatLngSerializer.f5136a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, latLngSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, latLngSerializer, value.j);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.f18137a, value.k);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, value.l);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, TripPlannerLegFareInfoAppResponseModel$$serializer.f4673a, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
