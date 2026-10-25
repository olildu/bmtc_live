package app.chalo.livetracking.search;

import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel;
import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel$$serializer;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentPlaceAppModel$$serializer;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/search/StopBasedSearchSelectedLocation.NearestStopToPlaceSelected.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$NearestStopToPlaceSelected;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class StopBasedSearchSelectedLocation$NearestStopToPlaceSelected$$serializer implements GeneratedSerializer<StopBasedSearchSelectedLocation.NearestStopToPlaceSelected> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StopBasedSearchSelectedLocation$NearestStopToPlaceSelected$$serializer f4482a;
    private static final SerialDescriptor descriptor;

    static {
        StopBasedSearchSelectedLocation$NearestStopToPlaceSelected$$serializer stopBasedSearchSelectedLocation$NearestStopToPlaceSelected$$serializer = new StopBasedSearchSelectedLocation$NearestStopToPlaceSelected$$serializer();
        f4482a = stopBasedSearchSelectedLocation$NearestStopToPlaceSelected$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.search.StopBasedSearchSelectedLocation.NearestStopToPlaceSelected", stopBasedSearchSelectedLocation$NearestStopToPlaceSelected$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("typeForAnalytics", false);
        pluginGeneratedSerialDescriptor.j("stop", false);
        pluginGeneratedSerialDescriptor.j("place", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.f18170a, NearbyStopToLocationAppModel$$serializer.f1741a, RecentPlaceAppModel$$serializer.f9002a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String strDecodeStringElement;
        NearbyStopToLocationAppModel nearbyStopToLocationAppModel;
        RecentPlaceAppModel recentPlaceAppModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            nearbyStopToLocationAppModel = (NearbyStopToLocationAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, NearbyStopToLocationAppModel$$serializer.f1741a, null);
            recentPlaceAppModel = (RecentPlaceAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, RecentPlaceAppModel$$serializer.f9002a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            NearbyStopToLocationAppModel nearbyStopToLocationAppModel2 = null;
            RecentPlaceAppModel recentPlaceAppModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    nearbyStopToLocationAppModel2 = (NearbyStopToLocationAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, NearbyStopToLocationAppModel$$serializer.f1741a, nearbyStopToLocationAppModel2);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    recentPlaceAppModel2 = (RecentPlaceAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, RecentPlaceAppModel$$serializer.f9002a, recentPlaceAppModel2);
                    i2 |= 4;
                }
            }
            i = i2;
            strDecodeStringElement = strDecodeStringElement2;
            nearbyStopToLocationAppModel = nearbyStopToLocationAppModel2;
            recentPlaceAppModel = recentPlaceAppModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StopBasedSearchSelectedLocation.NearestStopToPlaceSelected(i, strDecodeStringElement, nearbyStopToLocationAppModel, recentPlaceAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        StopBasedSearchSelectedLocation.NearestStopToPlaceSelected value = (StopBasedSearchSelectedLocation.NearestStopToPlaceSelected) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StopBasedSearchSelectedLocation.NearestStopToPlaceSelected.Companion companion = StopBasedSearchSelectedLocation.NearestStopToPlaceSelected.INSTANCE;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f4480a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, NearbyStopToLocationAppModel$$serializer.f1741a, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, RecentPlaceAppModel$$serializer.f9002a, value.d);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
