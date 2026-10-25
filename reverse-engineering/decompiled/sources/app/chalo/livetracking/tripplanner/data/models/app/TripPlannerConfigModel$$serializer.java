package app.chalo.livetracking.tripplanner.data.models.app;

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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/tripplanner/data/models/app/TripPlannerConfigModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/tripplanner/data/models/app/TripPlannerConfigModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class TripPlannerConfigModel$$serializer implements GeneratedSerializer<TripPlannerConfigModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TripPlannerConfigModel$$serializer f4660a;
    private static final SerialDescriptor descriptor;

    static {
        TripPlannerConfigModel$$serializer tripPlannerConfigModel$$serializer = new TripPlannerConfigModel$$serializer();
        f4660a = tripPlannerConfigModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.tripplanner.data.models.app.TripPlannerConfigModel", tripPlannerConfigModel$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("cityWiseConfig", false);
        pluginGeneratedSerialDescriptor.j("defaultConfig", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{TripPlannerConfigModel.c[0].getValue(), BuiltinSerializersKt.c(TripPlannerCityConfigModel$$serializer.f4658a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        TripPlannerCityConfigModel tripPlannerCityConfigModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = TripPlannerConfigModel.c;
        List list2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            tripPlannerCityConfigModel = (TripPlannerCityConfigModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, TripPlannerCityConfigModel$$serializer.f4658a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            TripPlannerCityConfigModel tripPlannerCityConfigModel2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    tripPlannerCityConfigModel2 = (TripPlannerCityConfigModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, TripPlannerCityConfigModel$$serializer.f4658a, tripPlannerCityConfigModel2);
                    i2 |= 2;
                }
            }
            i = i2;
            list = list2;
            tripPlannerCityConfigModel = tripPlannerCityConfigModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TripPlannerConfigModel(i, list, tripPlannerCityConfigModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        TripPlannerConfigModel value = (TripPlannerConfigModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SerializationStrategy serializationStrategy = (SerializationStrategy) TripPlannerConfigModel.c[0].getValue();
        List list = value.f4659a;
        TripPlannerCityConfigModel tripPlannerCityConfigModel = value.b;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, serializationStrategy, list);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || tripPlannerCityConfigModel != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, TripPlannerCityConfigModel$$serializer.f4658a, tripPlannerCityConfigModel);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
