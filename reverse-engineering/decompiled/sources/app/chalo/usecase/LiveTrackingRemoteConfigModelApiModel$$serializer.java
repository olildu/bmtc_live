package app.chalo.usecase;

import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.UnknownFieldException;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/usecase/LiveTrackingRemoteConfigModelApiModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/usecase/LiveTrackingRemoteConfigModelApiModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class LiveTrackingRemoteConfigModelApiModel$$serializer implements GeneratedSerializer<LiveTrackingRemoteConfigModelApiModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LiveTrackingRemoteConfigModelApiModel$$serializer f10212a;
    private static final SerialDescriptor descriptor;

    static {
        LiveTrackingRemoteConfigModelApiModel$$serializer liveTrackingRemoteConfigModelApiModel$$serializer = new LiveTrackingRemoteConfigModelApiModel$$serializer();
        f10212a = liveTrackingRemoteConfigModelApiModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.usecase.LiveTrackingRemoteConfigModelApiModel", liveTrackingRemoteConfigModelApiModel$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("cityWiseConfig", false);
        pluginGeneratedSerialDescriptor.j("defaultConfig", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{LiveTrackingRemoteConfigModelApiModel.c[0].getValue(), LiveTrackingRemoteConfigModel$$serializer.f10210a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        LiveTrackingRemoteConfigModel liveTrackingRemoteConfigModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = LiveTrackingRemoteConfigModelApiModel.c;
        List list2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            liveTrackingRemoteConfigModel = (LiveTrackingRemoteConfigModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, LiveTrackingRemoteConfigModel$$serializer.f10210a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            LiveTrackingRemoteConfigModel liveTrackingRemoteConfigModel2 = null;
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
                    liveTrackingRemoteConfigModel2 = (LiveTrackingRemoteConfigModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, LiveTrackingRemoteConfigModel$$serializer.f10210a, liveTrackingRemoteConfigModel2);
                    i2 |= 2;
                }
            }
            i = i2;
            list = list2;
            liveTrackingRemoteConfigModel = liveTrackingRemoteConfigModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new LiveTrackingRemoteConfigModelApiModel(i, list, liveTrackingRemoteConfigModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        LiveTrackingRemoteConfigModelApiModel value = (LiveTrackingRemoteConfigModelApiModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (SerializationStrategy) LiveTrackingRemoteConfigModelApiModel.c[0].getValue(), value.f10211a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, LiveTrackingRemoteConfigModel$$serializer.f10210a, value.b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
