package app.chalo.livetracking.tripplanner.data.models.app;

import app.chalo.location.LatLng;
import app.chalo.location.LatLngSerializer;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/tripplanner/data/models/app/TripPlannerRequestAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerRequestAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TripPlannerRequestAppModel$$serializer implements GeneratedSerializer<TripPlannerRequestAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TripPlannerRequestAppModel$$serializer f4681a;
    private static final SerialDescriptor descriptor;

    static {
        TripPlannerRequestAppModel$$serializer tripPlannerRequestAppModel$$serializer = new TripPlannerRequestAppModel$$serializer();
        f4681a = tripPlannerRequestAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.tripplanner.data.models.app.TripPlannerRequestAppModel", tripPlannerRequestAppModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("fromLatLng", false);
        pluginGeneratedSerialDescriptor.j("toLatLng", false);
        pluginGeneratedSerialDescriptor.j("transitMode", false);
        pluginGeneratedSerialDescriptor.j("startTimeMillis", false);
        pluginGeneratedSerialDescriptor.j("startStopId", false);
        pluginGeneratedSerialDescriptor.j("endStopId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = TripPlannerRequestAppModel.g;
        LatLngSerializer latLngSerializer = LatLngSerializer.f5136a;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{BuiltinSerializersKt.c(latLngSerializer), BuiltinSerializersKt.c(latLngSerializer), lazyArr[2].getValue(), LongSerializer.f18151a, BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        LatLng latLng;
        long j;
        LatLng latLng2;
        ChaloTransitMode chaloTransitMode;
        String str2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TripPlannerRequestAppModel.g;
        int i2 = 5;
        LatLng latLng3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LatLngSerializer latLngSerializer = LatLngSerializer.f5136a;
            LatLng latLng4 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, latLngSerializer, null);
            LatLng latLng5 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, latLngSerializer, null);
            ChaloTransitMode chaloTransitMode2 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            chaloTransitMode = chaloTransitMode2;
            latLng2 = latLng5;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            i = 63;
            str2 = str3;
            j = jDecodeLongElement;
            latLng = latLng4;
        } else {
            long jDecodeLongElement2 = 0;
            boolean z = true;
            int i3 = 0;
            String str4 = null;
            LatLng latLng6 = null;
            ChaloTransitMode chaloTransitMode3 = null;
            String str5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                        break;
                    case 0:
                        latLng3 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LatLngSerializer.f5136a, latLng3);
                        i3 |= 1;
                        i2 = 5;
                        break;
                    case 1:
                        latLng6 = (LatLng) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LatLngSerializer.f5136a, latLng6);
                        i3 |= 2;
                        i2 = 5;
                        break;
                    case 2:
                        chaloTransitMode3 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), chaloTransitMode3);
                        i3 |= 4;
                        break;
                    case 3:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str5);
                        i3 |= 16;
                        break;
                    case 5:
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str4);
                        i3 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = str4;
            latLng = latLng3;
            j = jDecodeLongElement2;
            latLng2 = latLng6;
            chaloTransitMode = chaloTransitMode3;
            str2 = str5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TripPlannerRequestAppModel(i, latLng, latLng2, chaloTransitMode, j, str2, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TripPlannerRequestAppModel value = (TripPlannerRequestAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TripPlannerRequestAppModel.g;
        LatLngSerializer latLngSerializer = LatLngSerializer.f5136a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, latLngSerializer, value.f4680a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, latLngSerializer, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), value.c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, value.d);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, value.f);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
