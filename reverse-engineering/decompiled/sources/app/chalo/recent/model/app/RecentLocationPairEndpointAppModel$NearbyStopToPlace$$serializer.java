package app.chalo.recent.model.app;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.citydata.data.model.app.StopAppModel$$serializer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/recent/model/app/RecentLocationPairEndpointAppModel.NearbyStopToPlace.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/recent/model/app/RecentLocationPairEndpointAppModel$NearbyStopToPlace;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RecentLocationPairEndpointAppModel$NearbyStopToPlace$$serializer implements GeneratedSerializer<RecentLocationPairEndpointAppModel.NearbyStopToPlace> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RecentLocationPairEndpointAppModel$NearbyStopToPlace$$serializer f8999a;
    private static final SerialDescriptor descriptor;

    static {
        RecentLocationPairEndpointAppModel$NearbyStopToPlace$$serializer recentLocationPairEndpointAppModel$NearbyStopToPlace$$serializer = new RecentLocationPairEndpointAppModel$NearbyStopToPlace$$serializer();
        f8999a = recentLocationPairEndpointAppModel$NearbyStopToPlace$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.recent.model.app.RecentLocationPairEndpointAppModel.NearbyStopToPlace", recentLocationPairEndpointAppModel$NearbyStopToPlace$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("stop", false);
        pluginGeneratedSerialDescriptor.j("place", false);
        pluginGeneratedSerialDescriptor.j("distanceMeters", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StopAppModel$$serializer.f1728a, RecentPlaceAppModel$$serializer.f9002a, LongSerializer.f18151a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        StopAppModel stopAppModel;
        long jDecodeLongElement;
        RecentPlaceAppModel recentPlaceAppModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        StopAppModel stopAppModel2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            stopAppModel = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, StopAppModel$$serializer.f1728a, null);
            i = 7;
            recentPlaceAppModel = (RecentPlaceAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, RecentPlaceAppModel$$serializer.f9002a, null);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
        } else {
            long jDecodeLongElement2 = 0;
            boolean z = true;
            int i2 = 0;
            RecentPlaceAppModel recentPlaceAppModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    stopAppModel2 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, StopAppModel$$serializer.f1728a, stopAppModel2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    recentPlaceAppModel2 = (RecentPlaceAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, RecentPlaceAppModel$$serializer.f9002a, recentPlaceAppModel2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            stopAppModel = stopAppModel2;
            jDecodeLongElement = jDecodeLongElement2;
            recentPlaceAppModel = recentPlaceAppModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecentLocationPairEndpointAppModel.NearbyStopToPlace(i, stopAppModel, recentPlaceAppModel, jDecodeLongElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RecentLocationPairEndpointAppModel.NearbyStopToPlace value = (RecentLocationPairEndpointAppModel.NearbyStopToPlace) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecentLocationPairEndpointAppModel.NearbyStopToPlace.Companion companion = RecentLocationPairEndpointAppModel.NearbyStopToPlace.INSTANCE;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, StopAppModel$$serializer.f1728a, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, RecentPlaceAppModel$$serializer.f9002a, value.c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
