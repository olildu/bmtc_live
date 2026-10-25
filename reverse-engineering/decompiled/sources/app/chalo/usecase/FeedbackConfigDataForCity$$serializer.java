package app.chalo.usecase;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/usecase/FeedbackConfigDataForCity.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/usecase/FeedbackConfigDataForCity;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class FeedbackConfigDataForCity$$serializer implements GeneratedSerializer<FeedbackConfigDataForCity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FeedbackConfigDataForCity$$serializer f10168a;
    private static final SerialDescriptor descriptor;

    static {
        FeedbackConfigDataForCity$$serializer feedbackConfigDataForCity$$serializer = new FeedbackConfigDataForCity$$serializer();
        f10168a = feedbackConfigDataForCity$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.usecase.FeedbackConfigDataForCity", feedbackConfigDataForCity$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("city", false);
        pluginGeneratedSerialDescriptor.j("titoRide", false);
        pluginGeneratedSerialDescriptor.j("conductorValidation", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        FeedbackConfig$$serializer feedbackConfig$$serializer = FeedbackConfig$$serializer.f10166a;
        return new KSerializer[]{StringSerializer.f18170a, BuiltinSerializersKt.c(feedbackConfig$$serializer), BuiltinSerializersKt.c(feedbackConfig$$serializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String strDecodeStringElement;
        FeedbackConfig feedbackConfig;
        FeedbackConfig feedbackConfig2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            FeedbackConfig$$serializer feedbackConfig$$serializer = FeedbackConfig$$serializer.f10166a;
            feedbackConfig = (FeedbackConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, feedbackConfig$$serializer, null);
            feedbackConfig2 = (FeedbackConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, feedbackConfig$$serializer, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            FeedbackConfig feedbackConfig3 = null;
            FeedbackConfig feedbackConfig4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    feedbackConfig3 = (FeedbackConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, FeedbackConfig$$serializer.f10166a, feedbackConfig3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    feedbackConfig4 = (FeedbackConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FeedbackConfig$$serializer.f10166a, feedbackConfig4);
                    i2 |= 4;
                }
            }
            i = i2;
            strDecodeStringElement = strDecodeStringElement2;
            feedbackConfig = feedbackConfig3;
            feedbackConfig2 = feedbackConfig4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FeedbackConfigDataForCity(i, strDecodeStringElement, feedbackConfig, feedbackConfig2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        FeedbackConfigDataForCity value = (FeedbackConfigDataForCity) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f10167a);
        FeedbackConfig$$serializer feedbackConfig$$serializer = FeedbackConfig$$serializer.f10166a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, feedbackConfig$$serializer, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, feedbackConfig$$serializer, value.c);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
