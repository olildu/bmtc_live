package app.chalo.livetracking.search;

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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/livetracking/search/StopBasedSearchSelectedLocation.StopSelected.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/livetracking/search/StopBasedSearchSelectedLocation$StopSelected;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class StopBasedSearchSelectedLocation$StopSelected$$serializer implements GeneratedSerializer<StopBasedSearchSelectedLocation.StopSelected> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final StopBasedSearchSelectedLocation$StopSelected$$serializer f4484a;
    private static final SerialDescriptor descriptor;

    static {
        StopBasedSearchSelectedLocation$StopSelected$$serializer stopBasedSearchSelectedLocation$StopSelected$$serializer = new StopBasedSearchSelectedLocation$StopSelected$$serializer();
        f4484a = stopBasedSearchSelectedLocation$StopSelected$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.livetracking.search.StopBasedSearchSelectedLocation.StopSelected", stopBasedSearchSelectedLocation$StopSelected$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("typeForAnalytics", false);
        pluginGeneratedSerialDescriptor.j("stop", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.f18170a, StopAppModel$$serializer.f1728a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String strDecodeStringElement;
        StopAppModel stopAppModel;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            stopAppModel = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, StopAppModel$$serializer.f1728a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            StopAppModel stopAppModel2 = null;
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
                    stopAppModel2 = (StopAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, StopAppModel$$serializer.f1728a, stopAppModel2);
                    i2 |= 2;
                }
            }
            i = i2;
            strDecodeStringElement = strDecodeStringElement2;
            stopAppModel = stopAppModel2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new StopBasedSearchSelectedLocation.StopSelected(i, strDecodeStringElement, stopAppModel);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        StopBasedSearchSelectedLocation.StopSelected value = (StopBasedSearchSelectedLocation.StopSelected) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        StopBasedSearchSelectedLocation.StopSelected.Companion companion = StopBasedSearchSelectedLocation.StopSelected.INSTANCE;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f4480a);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, StopAppModel$$serializer.f1728a, value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
