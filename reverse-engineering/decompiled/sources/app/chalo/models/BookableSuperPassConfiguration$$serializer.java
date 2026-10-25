package app.chalo.models;

import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigCategoryResponseAppModel$$serializer;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigFareMappingResponseAppModel$$serializer;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigSubCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigSubCategoryResponseAppModel$$serializer;
import java.util.ArrayList;
import java.util.List;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/models/BookableSuperPassConfiguration.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/models/BookableSuperPassConfiguration;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class BookableSuperPassConfiguration$$serializer implements GeneratedSerializer<BookableSuperPassConfiguration> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BookableSuperPassConfiguration$$serializer f5570a;
    private static final SerialDescriptor descriptor;

    static {
        BookableSuperPassConfiguration$$serializer bookableSuperPassConfiguration$$serializer = new BookableSuperPassConfiguration$$serializer();
        f5570a = bookableSuperPassConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.models.BookableSuperPassConfiguration", bookableSuperPassConfiguration$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("configId", true);
        pluginGeneratedSerialDescriptor.j("superPassProductConfigurationProperties", false);
        pluginGeneratedSerialDescriptor.j("selectedProductFareMapping", false);
        pluginGeneratedSerialDescriptor.j("selectedProductCategory", false);
        pluginGeneratedSerialDescriptor.j("selectedSubCategory", false);
        pluginGeneratedSerialDescriptor.j("requiredProofsList", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StringSerializer.f18170a, SuperPassProductConfigurationProperties$$serializer.f5601a, SuperPassProductConfigFareMappingResponseAppModel$$serializer.f8643a, SuperPassProductConfigCategoryResponseAppModel$$serializer.f8640a, BuiltinSerializersKt.c(SuperPassProductConfigSubCategoryResponseAppModel$$serializer.f8645a), BookableSuperPassConfiguration.g[5].getValue()};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties;
        SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel;
        SuperPassProductConfigCategoryResponseAppModel superPassProductConfigCategoryResponseAppModel;
        SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel;
        List list;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BookableSuperPassConfiguration.g;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            SuperPassProductConfigurationProperties superPassProductConfigurationProperties2 = (SuperPassProductConfigurationProperties) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, SuperPassProductConfigurationProperties$$serializer.f5601a, null);
            SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel2 = (SuperPassProductConfigFareMappingResponseAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, SuperPassProductConfigFareMappingResponseAppModel$$serializer.f8643a, null);
            SuperPassProductConfigCategoryResponseAppModel superPassProductConfigCategoryResponseAppModel2 = (SuperPassProductConfigCategoryResponseAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, SuperPassProductConfigCategoryResponseAppModel$$serializer.f8640a, null);
            SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel2 = (SuperPassProductConfigSubCategoryResponseAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, SuperPassProductConfigSubCategoryResponseAppModel$$serializer.f8645a, null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            str = strDecodeStringElement2;
            superPassProductConfigCategoryResponseAppModel = superPassProductConfigCategoryResponseAppModel2;
            superPassProductConfigSubCategoryResponseAppModel = superPassProductConfigSubCategoryResponseAppModel2;
            superPassProductConfigFareMappingResponseAppModel = superPassProductConfigFareMappingResponseAppModel2;
            i = 63;
            superPassProductConfigurationProperties = superPassProductConfigurationProperties2;
        } else {
            boolean z = true;
            int i2 = 0;
            SuperPassProductConfigurationProperties superPassProductConfigurationProperties3 = null;
            SuperPassProductConfigFareMappingResponseAppModel superPassProductConfigFareMappingResponseAppModel3 = null;
            SuperPassProductConfigCategoryResponseAppModel superPassProductConfigCategoryResponseAppModel3 = null;
            SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel3 = null;
            List list2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        superPassProductConfigurationProperties3 = (SuperPassProductConfigurationProperties) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, SuperPassProductConfigurationProperties$$serializer.f5601a, superPassProductConfigurationProperties3);
                        i2 |= 2;
                        break;
                    case 2:
                        superPassProductConfigFareMappingResponseAppModel3 = (SuperPassProductConfigFareMappingResponseAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, SuperPassProductConfigFareMappingResponseAppModel$$serializer.f8643a, superPassProductConfigFareMappingResponseAppModel3);
                        i2 |= 4;
                        break;
                    case 3:
                        superPassProductConfigCategoryResponseAppModel3 = (SuperPassProductConfigCategoryResponseAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, SuperPassProductConfigCategoryResponseAppModel$$serializer.f8640a, superPassProductConfigCategoryResponseAppModel3);
                        i2 |= 8;
                        break;
                    case 4:
                        superPassProductConfigSubCategoryResponseAppModel3 = (SuperPassProductConfigSubCategoryResponseAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, SuperPassProductConfigSubCategoryResponseAppModel$$serializer.f8645a, superPassProductConfigSubCategoryResponseAppModel3);
                        i2 |= 16;
                        break;
                    case 5:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), list2);
                        i2 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i2;
            str = strDecodeStringElement;
            superPassProductConfigurationProperties = superPassProductConfigurationProperties3;
            superPassProductConfigFareMappingResponseAppModel = superPassProductConfigFareMappingResponseAppModel3;
            superPassProductConfigCategoryResponseAppModel = superPassProductConfigCategoryResponseAppModel3;
            superPassProductConfigSubCategoryResponseAppModel = superPassProductConfigSubCategoryResponseAppModel3;
            list = list2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new BookableSuperPassConfiguration(i, str, superPassProductConfigurationProperties, superPassProductConfigFareMappingResponseAppModel, superPassProductConfigCategoryResponseAppModel, superPassProductConfigSubCategoryResponseAppModel, list);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        BookableSuperPassConfiguration value = (BookableSuperPassConfiguration) obj;
        Intrinsics.i(value, "value");
        String str = value.f5569a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = BookableSuperPassConfiguration.g;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.d(str, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        }
        SuperPassProductConfigurationProperties$$serializer superPassProductConfigurationProperties$$serializer = SuperPassProductConfigurationProperties$$serializer.f5601a;
        SuperPassProductConfigurationProperties superPassProductConfigurationProperties = value.b;
        List list = value.f;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, superPassProductConfigurationProperties$$serializer, superPassProductConfigurationProperties);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, SuperPassProductConfigFareMappingResponseAppModel$$serializer.f8643a, value.c);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, SuperPassProductConfigCategoryResponseAppModel$$serializer.f8640a, value.d);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, SuperPassProductConfigSubCategoryResponseAppModel$$serializer.f8645a, value.e);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.d(list, new ArrayList())) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), list);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
