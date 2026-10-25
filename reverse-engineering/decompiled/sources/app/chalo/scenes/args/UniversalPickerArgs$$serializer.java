package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import com.inmobi.media.C2533k0;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/scenes/args/UniversalPickerArgs.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/scenes/args/UniversalPickerArgs;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class UniversalPickerArgs$$serializer implements GeneratedSerializer<UniversalPickerArgs> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UniversalPickerArgs$$serializer f9337a;
    private static final SerialDescriptor descriptor;

    static {
        UniversalPickerArgs$$serializer universalPickerArgs$$serializer = new UniversalPickerArgs$$serializer();
        f9337a = universalPickerArgs$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.scenes.args.UniversalPickerArgs", universalPickerArgs$$serializer, 11);
        pluginGeneratedSerialDescriptor.j("searchOptions", false);
        pluginGeneratedSerialDescriptor.j("searchBarTitle", false);
        pluginGeneratedSerialDescriptor.j("searchSource", false);
        pluginGeneratedSerialDescriptor.j("screenSource", false);
        pluginGeneratedSerialDescriptor.j("searchType", true);
        pluginGeneratedSerialDescriptor.j("searchDestination", false);
        pluginGeneratedSerialDescriptor.j(C2533k0.KEY_REQUEST_ID, true);
        pluginGeneratedSerialDescriptor.j("transitMode", true);
        pluginGeneratedSerialDescriptor.j("headerTitle", true);
        pluginGeneratedSerialDescriptor.j("headerStepIndicator", true);
        pluginGeneratedSerialDescriptor.j("headerIcon", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = UniversalPickerArgs.m;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, lazyArr[3].getValue(), BuiltinSerializersKt.c(stringSerializer), stringSerializer, BuiltinSerializersKt.c(stringSerializer), lazyArr[7].getValue(), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[10].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        UniversalPickerHeaderIcon universalPickerHeaderIcon;
        String str;
        String str2;
        String str3;
        int i;
        ChaloTransitMode chaloTransitMode;
        String str4;
        Source source;
        String str5;
        String str6;
        String str7;
        String str8;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UniversalPickerArgs.m;
        int i2 = 9;
        int i3 = 7;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            Source source2 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            ChaloTransitMode chaloTransitMode2 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            universalPickerHeaderIcon = (UniversalPickerHeaderIcon) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, (DeserializationStrategy) lazyArr[10].getValue(), null);
            str5 = strDecodeStringElement2;
            str = str12;
            str3 = str10;
            str8 = strDecodeStringElement5;
            str2 = str11;
            str4 = str9;
            str7 = strDecodeStringElement4;
            chaloTransitMode = chaloTransitMode2;
            i = 2047;
            source = source2;
            str6 = strDecodeStringElement3;
        } else {
            int i4 = 10;
            boolean z = true;
            int i5 = 0;
            UniversalPickerHeaderIcon universalPickerHeaderIcon2 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            ChaloTransitMode chaloTransitMode3 = null;
            String str16 = null;
            Source source3 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            while (z) {
                int i6 = i3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 10;
                        i3 = 7;
                        break;
                    case 0:
                        i5 |= 1;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 = 10;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 1:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 10;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 2:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 10;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 3:
                        source3 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), source3);
                        i5 |= 8;
                        i4 = 10;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 4:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str16);
                        i5 |= 16;
                        i4 = 10;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 5:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                        i4 = 10;
                        i3 = 7;
                        break;
                    case 6:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str15);
                        i5 |= 64;
                        i4 = 10;
                        i3 = 7;
                        break;
                    case 7:
                        chaloTransitMode3 = (ChaloTransitMode) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i6].getValue(), chaloTransitMode3);
                        i5 |= 128;
                        i3 = i6;
                        i4 = 10;
                        break;
                    case 8:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str14);
                        i5 |= 256;
                        i3 = i6;
                        break;
                    case 9:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str13);
                        i5 |= 512;
                        i3 = i6;
                        break;
                    case 10:
                        universalPickerHeaderIcon2 = (UniversalPickerHeaderIcon) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i4].getValue(), universalPickerHeaderIcon2);
                        i5 |= 1024;
                        i3 = i6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            universalPickerHeaderIcon = universalPickerHeaderIcon2;
            str = str13;
            str2 = str14;
            str3 = str15;
            i = i5;
            chaloTransitMode = chaloTransitMode3;
            str4 = str16;
            source = source3;
            str5 = strDecodeStringElement;
            str6 = strDecodeStringElement6;
            str7 = strDecodeStringElement7;
            str8 = strDecodeStringElement8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UniversalPickerArgs(i, str5, str6, str7, source, str4, str8, str3, chaloTransitMode, str2, str, universalPickerHeaderIcon);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        UniversalPickerArgs value = (UniversalPickerArgs) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UniversalPickerArgs.m;
        String str = value.b;
        UniversalPickerHeaderIcon universalPickerHeaderIcon = value.l;
        String str2 = value.k;
        String str3 = value.j;
        ChaloTransitMode chaloTransitMode = value.i;
        String str4 = value.h;
        String str5 = value.f;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.c);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), value.e);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || str5 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.f18170a, str5);
        }
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.g);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || str4 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || chaloTransitMode != ChaloTransitMode.BUS) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), chaloTransitMode);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 10) || universalPickerHeaderIcon != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, (SerializationStrategy) lazyArr[10].getValue(), universalPickerHeaderIcon);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
