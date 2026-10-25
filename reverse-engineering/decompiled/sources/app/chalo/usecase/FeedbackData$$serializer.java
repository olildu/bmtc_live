package app.chalo.usecase;

import androidx.compose.material3.internal.CalendarModelKt;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/usecase/FeedbackData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/usecase/FeedbackData;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class FeedbackData$$serializer implements GeneratedSerializer<FeedbackData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FeedbackData$$serializer f10170a;
    private static final SerialDescriptor descriptor;

    static {
        FeedbackData$$serializer feedbackData$$serializer = new FeedbackData$$serializer();
        f10170a = feedbackData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.usecase.FeedbackData", feedbackData$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("ratingRange", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        pluginGeneratedSerialDescriptor.j("feedbackTags", false);
        pluginGeneratedSerialDescriptor.j("requireTextFeedback", false);
        pluginGeneratedSerialDescriptor.j("feedbackTimeout", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = FeedbackData.f;
        return new KSerializer[]{lazyArr[0].getValue(), StringSerializer.f18170a, lazyArr[2].getValue(), BooleanSerializer.f18123a, LongSerializer.f18151a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        long jDecodeLongElement;
        Pair pair;
        String str;
        List list;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FeedbackData.f;
        int i2 = 3;
        int i3 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Pair pair2 = (Pair) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            pair = pair2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            str = strDecodeStringElement;
            i = 31;
        } else {
            long jDecodeLongElement2 = 0;
            int i4 = 1;
            boolean zDecodeBooleanElement2 = false;
            Pair pair3 = null;
            String strDecodeStringElement2 = null;
            List list2 = null;
            int i5 = 0;
            while (i4 != 0) {
                int i6 = i3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    i3 = i6;
                    i4 = i3;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list2);
                        i5 |= 4;
                    } else if (iDecodeElementIndex == i2) {
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i5 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i5 |= 16;
                    }
                    i3 = i6;
                } else {
                    pair3 = (Pair) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i6].getValue(), pair3);
                    i5 |= 1;
                    i3 = i6;
                }
                i2 = 3;
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i = i5;
            jDecodeLongElement = jDecodeLongElement2;
            pair = pair3;
            str = strDecodeStringElement2;
            list = list2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FeedbackData(i, pair, str, list, zDecodeBooleanElement, jDecodeLongElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        FeedbackData value = (FeedbackData) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = FeedbackData.f;
        SerializationStrategy serializationStrategy = (SerializationStrategy) lazyArr[0].getValue();
        Pair pair = value.f10169a;
        long j = value.e;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, serializationStrategy, pair);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), value.c);
        compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, value.d);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || j != CalendarModelKt.MillisecondsIn24Hours) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, j);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
