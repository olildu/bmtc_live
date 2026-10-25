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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/homescreen/data/model/app/PassCardDataAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/homescreen/data/model/app/PassCardDataAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PassCardDataAppModel$$serializer implements GeneratedSerializer<PassCardDataAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PassCardDataAppModel$$serializer f3773a;
    private static final SerialDescriptor descriptor;

    static {
        PassCardDataAppModel$$serializer passCardDataAppModel$$serializer = new PassCardDataAppModel$$serializer();
        f3773a = passCardDataAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.homescreen.data.model.app.PassCardDataAppModel", passCardDataAppModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("itemBgColor", true);
        pluginGeneratedSerialDescriptor.j("itemImageUrl", true);
        pluginGeneratedSerialDescriptor.j("itemPosition", false);
        pluginGeneratedSerialDescriptor.j("itemTextData", false);
        pluginGeneratedSerialDescriptor.j("productConfigId", false);
        pluginGeneratedSerialDescriptor.j("itemFallbackImage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = PassCardDataAppModel.g;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer), IntSerializer.f18146a, ItemTextDataAppModel$$serializer.f3758a, stringSerializer, BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue())};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        int i2;
        String str;
        String str2;
        ItemTextDataAppModel itemTextDataAppModel;
        String str3;
        IconType iconType;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PassCardDataAppModel.g;
        int i3 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            ItemTextDataAppModel itemTextDataAppModel2 = (ItemTextDataAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, ItemTextDataAppModel$$serializer.f3758a, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            iconType = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            str2 = str5;
            itemTextDataAppModel = itemTextDataAppModel2;
            str3 = strDecodeStringElement;
            i = iDecodeIntElement;
            i2 = 63;
            str = str4;
        } else {
            boolean z = true;
            int iDecodeIntElement2 = 0;
            String str6 = null;
            String str7 = null;
            ItemTextDataAppModel itemTextDataAppModel3 = null;
            String strDecodeStringElement2 = null;
            IconType iconType2 = null;
            int i4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 3;
                        break;
                    case 0:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str6);
                        i4 |= 1;
                        i3 = 3;
                        break;
                    case 1:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str7);
                        i4 |= 2;
                        break;
                    case 2:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        itemTextDataAppModel3 = (ItemTextDataAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, ItemTextDataAppModel$$serializer.f3758a, itemTextDataAppModel3);
                        i4 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 |= 16;
                        break;
                    case 5:
                        iconType2 = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), iconType2);
                        i4 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement2;
            i2 = i4;
            str = str6;
            str2 = str7;
            itemTextDataAppModel = itemTextDataAppModel3;
            str3 = strDecodeStringElement2;
            iconType = iconType2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PassCardDataAppModel(i2, str, str2, i, itemTextDataAppModel, str3, iconType);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PassCardDataAppModel value = (PassCardDataAppModel) obj;
        Intrinsics.i(value, "value");
        String str = value.b;
        String str2 = value.f3772a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = PassCardDataAppModel.g;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str);
        }
        int i = value.c;
        IconType iconType = value.f;
        compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, i);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, ItemTextDataAppModel$$serializer.f3758a, value.d);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || iconType != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), iconType);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
