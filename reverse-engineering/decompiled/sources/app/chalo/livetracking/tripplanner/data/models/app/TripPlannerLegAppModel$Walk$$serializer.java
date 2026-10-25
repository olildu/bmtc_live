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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel.Walk.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerLegAppModel$Walk;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TripPlannerLegAppModel$Walk$$serializer implements GeneratedSerializer<TripPlannerLegAppModel.Walk> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TripPlannerLegAppModel$Walk$$serializer f4671a;
    private static final SerialDescriptor descriptor;

    static {
        TripPlannerLegAppModel$Walk$$serializer tripPlannerLegAppModel$Walk$$serializer = new TripPlannerLegAppModel$Walk$$serializer();
        f4671a = tripPlannerLegAppModel$Walk$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel.Walk", tripPlannerLegAppModel$Walk$$serializer, 7);
        pluginGeneratedSerialDescriptor.j("fromLatLng", false);
        pluginGeneratedSerialDescriptor.j("toLatLng", false);
        pluginGeneratedSerialDescriptor.j("distanceInMeters", false);
        pluginGeneratedSerialDescriptor.j("travelTimeInSeconds", false);
        pluginGeneratedSerialDescriptor.j("startPlaceName", false);
        pluginGeneratedSerialDescriptor.j("endPlaceName", false);
        pluginGeneratedSerialDescriptor.j("polyline", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        LatLngSerializer latLngSerializer = LatLngSerializer.f5136a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(latLngSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(latLngSerializer);
        DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(doubleSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c(doubleSerializer);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        LatLng latLng;
        LatLng latLng2;
        Double d;
        Double d2;
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
            DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
            Double d3 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, doubleSerializer, null);
            Double d4 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, doubleSerializer, null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            latLng2 = latLng5;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            str3 = str5;
            d2 = d4;
            str2 = str4;
            d = d3;
            i = 127;
            latLng = latLng4;
        } else {
            boolean z = true;
            int i3 = 0;
            String str6 = null;
            LatLng latLng6 = null;
            Double d5 = null;
            Double d6 = null;
            String str7 = null;
            String str8 = null;
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
                        d5 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, DoubleSerializer.f18137a, d5);
                        i3 |= 4;
                        break;
                    case 3:
                        d6 = (Double) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, DoubleSerializer.f18137a, d6);
                        i3 |= 8;
                        break;
                    case 4:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str7);
                        i3 |= 16;
                        break;
                    case 5:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.f18170a, str8);
                        i3 |= 32;
                        break;
                    case 6:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str6);
                        i3 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = str6;
            latLng = latLng3;
            latLng2 = latLng6;
            d = d5;
            d2 = d6;
            str2 = str7;
            str3 = str8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TripPlannerLegAppModel.Walk(i, latLng, latLng2, d, d2, str2, str3, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TripPlannerLegAppModel.Walk value = (TripPlannerLegAppModel.Walk) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TripPlannerLegAppModel.Walk.Companion companion = TripPlannerLegAppModel.Walk.INSTANCE;
        LatLngSerializer latLngSerializer = LatLngSerializer.f5136a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, latLngSerializer, value.i);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, latLngSerializer, value.j);
        DoubleSerializer doubleSerializer = DoubleSerializer.f18137a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, doubleSerializer, value.k);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, doubleSerializer, value.l);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, value.m);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.n);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, value.o);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
