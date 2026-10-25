package app.chalo.homescreen.data.model.app;

import app.chalo.data.TextFormatAppModel;
import app.chalo.providers.iconassetprovider.IconType;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/homescreen/data/model/app/ChaloBusHeaderAppModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/homescreen/data/model/app/ChaloBusHeaderAppModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ChaloBusHeaderAppModel$$serializer implements GeneratedSerializer<ChaloBusHeaderAppModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ChaloBusHeaderAppModel$$serializer f3724a;
    private static final SerialDescriptor descriptor;

    static {
        ChaloBusHeaderAppModel$$serializer chaloBusHeaderAppModel$$serializer = new ChaloBusHeaderAppModel$$serializer();
        f3724a = chaloBusHeaderAppModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.homescreen.data.model.app.ChaloBusHeaderAppModel", chaloBusHeaderAppModel$$serializer, 5);
        pluginGeneratedSerialDescriptor.j(InMobiNetworkValues.ICON, true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("tagList", true);
        pluginGeneratedSerialDescriptor.j("imageUrl", true);
        pluginGeneratedSerialDescriptor.j("fullContentImageUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ChaloBusHeaderAppModel.f;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{BuiltinSerializersKt.c((KSerializer) lazyArr[0].getValue()), lazyArr[1].getValue(), lazyArr[2].getValue(), stringSerializer, stringSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        IconType iconType;
        TextFormatAppModel textFormatAppModel;
        List list;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ChaloBusHeaderAppModel.f;
        int i2 = 0;
        IconType iconType2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            IconType iconType3 = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            TextFormatAppModel textFormatAppModel2 = (TextFormatAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), null);
            iconType = iconType3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            i = 31;
            textFormatAppModel = textFormatAppModel2;
        } else {
            int i3 = 1;
            int i4 = 0;
            TextFormatAppModel textFormatAppModel3 = null;
            List list2 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            while (i3 != 0) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                int i5 = i2;
                if (iDecodeElementIndex == -1) {
                    i2 = i5;
                    i3 = i2;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        textFormatAppModel3 = (TextFormatAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy) lazyArr[1].getValue(), textFormatAppModel3);
                        i4 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy) lazyArr[2].getValue(), list2);
                        i4 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 |= 16;
                    }
                    i2 = i5;
                } else {
                    iconType2 = (IconType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), iconType2);
                    i4 |= 1;
                    i2 = i5;
                }
            }
            i = i4;
            iconType = iconType2;
            textFormatAppModel = textFormatAppModel3;
            list = list2;
            strDecodeStringElement = strDecodeStringElement3;
            strDecodeStringElement2 = strDecodeStringElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ChaloBusHeaderAppModel(i, iconType, textFormatAppModel, list, strDecodeStringElement, strDecodeStringElement2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ChaloBusHeaderAppModel value = (ChaloBusHeaderAppModel) obj;
        Intrinsics.i(value, "value");
        String str = value.e;
        String str2 = value.d;
        List list = value.c;
        TextFormatAppModel textFormatAppModel = value.b;
        IconType iconType = value.f3723a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ChaloBusHeaderAppModel.f;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || iconType != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), iconType);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.d(textFormatAppModel, new TextFormatAppModel.Simple(""))) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (SerializationStrategy) lazyArr[1].getValue(), textFormatAppModel);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.d(list, EmptyList.f17557a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, (SerializationStrategy) lazyArr[2].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.d(str2, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.d(str, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
