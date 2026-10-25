package app.chalo.recent.database.entities;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/recent/database/entities/RecentLocationPairEndpointEntity.NearbyStopToPlaceEndpoint.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/recent/database/entities/RecentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "framework-city-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class RecentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint$$serializer implements GeneratedSerializer<RecentLocationPairEndpointEntity.NearbyStopToPlaceEndpoint> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RecentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint$$serializer f8936a;
    private static final SerialDescriptor descriptor;

    static {
        RecentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint$$serializer recentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint$$serializer = new RecentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint$$serializer();
        f8936a = recentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.recent.database.entities.RecentLocationPairEndpointEntity.NearbyStopToPlaceEndpoint", recentLocationPairEndpointEntity$NearbyStopToPlaceEndpoint$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("stop", false);
        pluginGeneratedSerialDescriptor.j("place", false);
        pluginGeneratedSerialDescriptor.j("distanceMeters", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{RecentStopInfoEntity$$serializer.f8948a, RecentPlaceEntity$$serializer.f8941a, LongSerializer.f18151a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        RecentStopInfoEntity recentStopInfoEntity;
        long jDecodeLongElement;
        RecentPlaceEntity recentPlaceEntity;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        RecentStopInfoEntity recentStopInfoEntity2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            recentStopInfoEntity = (RecentStopInfoEntity) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, RecentStopInfoEntity$$serializer.f8948a, null);
            i = 7;
            recentPlaceEntity = (RecentPlaceEntity) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, RecentPlaceEntity$$serializer.f8941a, null);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
        } else {
            long jDecodeLongElement2 = 0;
            boolean z = true;
            int i2 = 0;
            RecentPlaceEntity recentPlaceEntity2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    recentStopInfoEntity2 = (RecentStopInfoEntity) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, RecentStopInfoEntity$$serializer.f8948a, recentStopInfoEntity2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    recentPlaceEntity2 = (RecentPlaceEntity) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, RecentPlaceEntity$$serializer.f8941a, recentPlaceEntity2);
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
            recentStopInfoEntity = recentStopInfoEntity2;
            jDecodeLongElement = jDecodeLongElement2;
            recentPlaceEntity = recentPlaceEntity2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecentLocationPairEndpointEntity.NearbyStopToPlaceEndpoint(i, recentStopInfoEntity, recentPlaceEntity, jDecodeLongElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        RecentLocationPairEndpointEntity.NearbyStopToPlaceEndpoint value = (RecentLocationPairEndpointEntity.NearbyStopToPlaceEndpoint) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecentLocationPairEndpointEntity.NearbyStopToPlaceEndpoint.Companion companion = RecentLocationPairEndpointEntity.NearbyStopToPlaceEndpoint.INSTANCE;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, RecentStopInfoEntity$$serializer.f8948a, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, RecentPlaceEntity$$serializer.f8941a, value.c);
        compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
