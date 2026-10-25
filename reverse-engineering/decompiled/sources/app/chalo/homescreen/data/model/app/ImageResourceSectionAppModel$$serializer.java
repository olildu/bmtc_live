package app.chalo.homescreen.data.model.app;

import app.chalo.providers.iconassetprovider.IconType;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/homescreen/data/model/app/ImageResourceSectionAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/homescreen/data/model/app/ImageResourceSectionAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ImageResourceSectionAppModel$$serializer implements GeneratedSerializer<ImageResourceSectionAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ImageResourceSectionAppModel$$serializer f3756a;
    private static final SerialDescriptor descriptor;

    static {
        ImageResourceSectionAppModel$$serializer imageResourceSectionAppModel$$serializer = new ImageResourceSectionAppModel$$serializer();
        f3756a = imageResourceSectionAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.homescreen.data.model.app.ImageResourceSectionAppModel", imageResourceSectionAppModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("backgroundImageUrl", false);
        pluginGeneratedSerialDescriptor.j("contentPadding", false);
        pluginGeneratedSerialDescriptor.j("onClickUrl", true);
        pluginGeneratedSerialDescriptor.j("placement", true);
        pluginGeneratedSerialDescriptor.j("showDivider", true);
        pluginGeneratedSerialDescriptor.j("ctaType", true);
        pluginGeneratedSerialDescriptor.j("sectionTitle", true);
        pluginGeneratedSerialDescriptor.j("fallbackIcon", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ImageResourceSectionAppModel.i;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, IntSerializer.f18146a, BuiltinSerializersKt.c(stringSerializer), lazyArr[3].getValue(), BooleanSerializer.f18123a, BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue()), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c((KSerializer) lazyArr[7].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean z;
        String str;
        IconType iconType;
        ImageResourceCtaType imageResourceCtaType;
        ImageResourcePlacement imageResourcePlacement;
        int i;
        int i2;
        String str2;
        String str3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ImageResourceSectionAppModel.i;
        int i3 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            ImageResourcePlacement imageResourcePlacement2 = (ImageResourcePlacement) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            ImageResourceCtaType imageResourceCtaType2 = (ImageResourceCtaType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            iconType = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), null);
            str2 = strDecodeStringElement;
            str = str5;
            z = zDecodeBooleanElement;
            str3 = str4;
            i = 255;
            imageResourceCtaType = imageResourceCtaType2;
            imageResourcePlacement = imageResourcePlacement2;
            i2 = iDecodeIntElement;
        } else {
            int i4 = 3;
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement2 = 0;
            String str6 = null;
            IconType iconType2 = null;
            ImageResourceCtaType imageResourceCtaType3 = null;
            String strDecodeStringElement2 = null;
            String str7 = null;
            int i5 = 0;
            ImageResourcePlacement imageResourcePlacement3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 6;
                        i4 = 3;
                        break;
                    case 0:
                        i5 |= 1;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 = 6;
                        i4 = 3;
                        break;
                    case 1:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i5 |= 2;
                        i3 = 6;
                        i4 = 3;
                        break;
                    case 2:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str7);
                        i5 |= 4;
                        i3 = 6;
                        i4 = 3;
                        break;
                    case 3:
                        imageResourcePlacement3 = (ImageResourcePlacement) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i4, (DeserializationStrategy) lazyArr[i4].getValue(), imageResourcePlacement3);
                        i5 |= 8;
                        i3 = 6;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i5 |= 16;
                        break;
                    case 5:
                        imageResourceCtaType3 = (ImageResourceCtaType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), imageResourceCtaType3);
                        i5 |= 32;
                        break;
                    case 6:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.f18170a, str6);
                        i5 |= 64;
                        break;
                    case 7:
                        iconType2 = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (DeserializationStrategy) lazyArr[7].getValue(), iconType2);
                        i5 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            z = zDecodeBooleanElement2;
            str = str6;
            iconType = iconType2;
            imageResourceCtaType = imageResourceCtaType3;
            imageResourcePlacement = imageResourcePlacement3;
            i = i5;
            i2 = iDecodeIntElement2;
            str2 = strDecodeStringElement2;
            str3 = str7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ImageResourceSectionAppModel(i, str2, i2, str3, imageResourcePlacement, z, imageResourceCtaType, str, iconType);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ImageResourceSectionAppModel value = (ImageResourceSectionAppModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ImageResourceSectionAppModel.i;
        String str = value.f3755a;
        IconType iconType = value.h;
        String str2 = value.g;
        ImageResourceCtaType imageResourceCtaType = value.f;
        boolean z = value.e;
        ImageResourcePlacement imageResourcePlacement = value.d;
        String str3 = value.c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 1, value.b);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || imageResourcePlacement != ImageResourcePlacement.BELOW_HEADER) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), imageResourcePlacement);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || imageResourceCtaType != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), imageResourceCtaType);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || iconType != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, (SerializationStrategy) lazyArr[7].getValue(), iconType);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
