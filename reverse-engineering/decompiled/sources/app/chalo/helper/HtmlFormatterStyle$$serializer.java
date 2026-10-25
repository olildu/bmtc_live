package app.chalo.helper;

import androidx.media3.extractor.text.ttml.TtmlNode;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/helper/HtmlFormatterStyle.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/helper/HtmlFormatterStyle;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class HtmlFormatterStyle$$serializer implements GeneratedSerializer<HtmlFormatterStyle> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HtmlFormatterStyle$$serializer f2836a;
    private static final SerialDescriptor descriptor;

    static {
        HtmlFormatterStyle$$serializer htmlFormatterStyle$$serializer = new HtmlFormatterStyle$$serializer();
        f2836a = htmlFormatterStyle$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.helper.HtmlFormatterStyle", htmlFormatterStyle$$serializer, 3);
        pluginGeneratedSerialDescriptor.j(TtmlNode.ATTR_TTS_FONT_WEIGHT, false);
        pluginGeneratedSerialDescriptor.j("textSize", false);
        pluginGeneratedSerialDescriptor.j("textColorHex", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{HtmlFormatterStyle.d[0].getValue(), IntSerializer.f18146a, BuiltinSerializersKt.c(StringSerializer.f18170a)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int iDecodeIntElement;
        int i;
        HtmlFormatterFontWeight htmlFormatterFontWeight;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = HtmlFormatterStyle.d;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            htmlFormatterFontWeight = (HtmlFormatterFontWeight) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, null);
            i = 7;
        } else {
            boolean z = true;
            iDecodeIntElement = 0;
            HtmlFormatterFontWeight htmlFormatterFontWeight2 = null;
            String str2 = null;
            int i2 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    htmlFormatterFontWeight2 = (HtmlFormatterFontWeight) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), htmlFormatterFontWeight2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str2);
                    i2 |= 4;
                }
            }
            i = i2;
            htmlFormatterFontWeight = htmlFormatterFontWeight2;
            str = str2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HtmlFormatterStyle(i, htmlFormatterFontWeight, iDecodeIntElement, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        HtmlFormatterStyle value = (HtmlFormatterStyle) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SerializationStrategy serializationStrategy = (SerializationStrategy) HtmlFormatterStyle.d[0].getValue();
        HtmlFormatterFontWeight htmlFormatterFontWeight = value.f2835a;
        String str = value.c;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, serializationStrategy, htmlFormatterFontWeight);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.b);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
