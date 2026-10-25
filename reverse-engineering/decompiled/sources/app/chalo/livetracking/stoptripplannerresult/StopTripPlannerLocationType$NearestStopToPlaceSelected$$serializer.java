package app.chalo.livetracking.stoptripplannerresult;

import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel;
import app.chalo.citydata.data.model.app.response.NearbyStopToLocationAppModel$$serializer;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.recent.model.app.RecentPlaceAppModel$$serializer;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType.NearestStopToPlaceSelected.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/stoptripplannerresult/StopTripPlannerLocationType$NearestStopToPlaceSelected;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class StopTripPlannerLocationType$NearestStopToPlaceSelected$$serializer implements GeneratedSerializer<StopTripPlannerLocationType.NearestStopToPlaceSelected> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StopTripPlannerLocationType$NearestStopToPlaceSelected$$serializer f4533a;
    private static final SerialDescriptor descriptor;

    static {
        StopTripPlannerLocationType$NearestStopToPlaceSelected$$serializer stopTripPlannerLocationType$NearestStopToPlaceSelected$$serializer = new StopTripPlannerLocationType$NearestStopToPlaceSelected$$serializer();
        f4533a = stopTripPlannerLocationType$NearestStopToPlaceSelected$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.stoptripplannerresult.StopTripPlannerLocationType.NearestStopToPlaceSelected", stopTripPlannerLocationType$NearestStopToPlaceSelected$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("typeForAnalytics", false);
        pluginGeneratedSerialDescriptor.j("stop", false);
        pluginGeneratedSerialDescriptor.j("associatedPlace", false);
        pluginGeneratedSerialDescriptor.j("nearestStopList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.f18170a, NearbyStopToLocationAppModel$$serializer.f1741a, RecentPlaceAppModel$$serializer.f9002a, BuiltinSerializersKt.c((KSerializer) StopTripPlannerLocationType.NearestStopToPlaceSelected.f[3].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        NearbyStopToLocationAppModel nearbyStopToLocationAppModel;
        RecentPlaceAppModel recentPlaceAppModel;
        List list;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = StopTripPlannerLocationType.NearestStopToPlaceSelected.f;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            NearbyStopToLocationAppModel nearbyStopToLocationAppModel2 = (NearbyStopToLocationAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, NearbyStopToLocationAppModel$$serializer.f1741a, null);
            RecentPlaceAppModel recentPlaceAppModel2 = (RecentPlaceAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, RecentPlaceAppModel$$serializer.f9002a, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            str = strDecodeStringElement2;
            recentPlaceAppModel = recentPlaceAppModel2;
            i = 15;
            nearbyStopToLocationAppModel = nearbyStopToLocationAppModel2;
        } else {
            boolean z = true;
            int i2 = 0;
            NearbyStopToLocationAppModel nearbyStopToLocationAppModel3 = null;
            RecentPlaceAppModel recentPlaceAppModel3 = null;
            List list2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    nearbyStopToLocationAppModel3 = (NearbyStopToLocationAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, NearbyStopToLocationAppModel$$serializer.f1741a, nearbyStopToLocationAppModel3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    recentPlaceAppModel3 = (RecentPlaceAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, RecentPlaceAppModel$$serializer.f9002a, recentPlaceAppModel3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), list2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            nearbyStopToLocationAppModel = nearbyStopToLocationAppModel3;
            recentPlaceAppModel = recentPlaceAppModel3;
            list = list2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StopTripPlannerLocationType.NearestStopToPlaceSelected(i, str, nearbyStopToLocationAppModel, recentPlaceAppModel, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        StopTripPlannerLocationType.NearestStopToPlaceSelected value = (StopTripPlannerLocationType.NearestStopToPlaceSelected) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StopTripPlannerLocationType.NearestStopToPlaceSelected.Companion companion = StopTripPlannerLocationType.NearestStopToPlaceSelected.INSTANCE;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f4531a);
        Lazy[] lazyArr = StopTripPlannerLocationType.NearestStopToPlaceSelected.f;
        NearbyStopToLocationAppModel$$serializer nearbyStopToLocationAppModel$$serializer = NearbyStopToLocationAppModel$$serializer.f1741a;
        NearbyStopToLocationAppModel nearbyStopToLocationAppModel = value.c;
        List list = value.e;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, nearbyStopToLocationAppModel$$serializer, nearbyStopToLocationAppModel);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, RecentPlaceAppModel$$serializer.f9002a, value.d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || list != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
