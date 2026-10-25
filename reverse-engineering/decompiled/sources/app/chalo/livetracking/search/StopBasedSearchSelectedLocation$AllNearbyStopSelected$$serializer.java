package app.chalo.livetracking.search;

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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/search/StopBasedSearchSelectedLocation.AllNearbyStopSelected.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$AllNearbyStopSelected;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class StopBasedSearchSelectedLocation$AllNearbyStopSelected$$serializer implements GeneratedSerializer<StopBasedSearchSelectedLocation.AllNearbyStopSelected> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StopBasedSearchSelectedLocation$AllNearbyStopSelected$$serializer f4481a;
    private static final SerialDescriptor descriptor;

    static {
        StopBasedSearchSelectedLocation$AllNearbyStopSelected$$serializer stopBasedSearchSelectedLocation$AllNearbyStopSelected$$serializer = new StopBasedSearchSelectedLocation$AllNearbyStopSelected$$serializer();
        f4481a = stopBasedSearchSelectedLocation$AllNearbyStopSelected$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.search.StopBasedSearchSelectedLocation.AllNearbyStopSelected", stopBasedSearchSelectedLocation$AllNearbyStopSelected$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("typeForAnalytics", false);
        pluginGeneratedSerialDescriptor.j("place", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.f18170a, RecentPlaceAppModel$$serializer.f9002a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String strDecodeStringElement;
        RecentPlaceAppModel recentPlaceAppModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            recentPlaceAppModel = (RecentPlaceAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, RecentPlaceAppModel$$serializer.f9002a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            RecentPlaceAppModel recentPlaceAppModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    recentPlaceAppModel2 = (RecentPlaceAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, RecentPlaceAppModel$$serializer.f9002a, recentPlaceAppModel2);
                    i2 |= 2;
                }
            }
            i = i2;
            strDecodeStringElement = strDecodeStringElement2;
            recentPlaceAppModel = recentPlaceAppModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StopBasedSearchSelectedLocation.AllNearbyStopSelected(i, strDecodeStringElement, recentPlaceAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        StopBasedSearchSelectedLocation.AllNearbyStopSelected value = (StopBasedSearchSelectedLocation.AllNearbyStopSelected) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StopBasedSearchSelectedLocation.AllNearbyStopSelected.Companion companion = StopBasedSearchSelectedLocation.AllNearbyStopSelected.INSTANCE;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f4480a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, RecentPlaceAppModel$$serializer.f9002a, value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
