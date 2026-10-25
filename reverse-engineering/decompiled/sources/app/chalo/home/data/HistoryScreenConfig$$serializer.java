package app.chalo.home.data;

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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/home/data/HistoryScreenConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/home/data/HistoryScreenConfig;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class HistoryScreenConfig$$serializer implements GeneratedSerializer<HistoryScreenConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HistoryScreenConfig$$serializer f2869a;
    private static final SerialDescriptor descriptor;

    static {
        HistoryScreenConfig$$serializer historyScreenConfig$$serializer = new HistoryScreenConfig$$serializer();
        f2869a = historyScreenConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.home.data.HistoryScreenConfig", historyScreenConfig$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("cityWiseConfig", false);
        pluginGeneratedSerialDescriptor.j("defaultConfig", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{HistoryScreenConfig.c[0].getValue(), HistoryScreenConfigForCity$$serializer.f2871a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        HistoryScreenConfigForCity historyScreenConfigForCity;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = HistoryScreenConfig.c;
        List list2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            historyScreenConfigForCity = (HistoryScreenConfigForCity) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, HistoryScreenConfigForCity$$serializer.f2871a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            HistoryScreenConfigForCity historyScreenConfigForCity2 = null;
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
                    historyScreenConfigForCity2 = (HistoryScreenConfigForCity) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, HistoryScreenConfigForCity$$serializer.f2871a, historyScreenConfigForCity2);
                    i2 |= 2;
                }
            }
            i = i2;
            list = list2;
            historyScreenConfigForCity = historyScreenConfigForCity2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HistoryScreenConfig(i, list, historyScreenConfigForCity);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        HistoryScreenConfig value = (HistoryScreenConfig) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (SerializationStrategy) HistoryScreenConfig.c[0].getValue(), value.f2868a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, HistoryScreenConfigForCity$$serializer.f2871a, value.b);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
