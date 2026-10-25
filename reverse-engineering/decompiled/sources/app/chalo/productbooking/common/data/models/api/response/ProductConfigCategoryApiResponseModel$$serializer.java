package app.chalo.productbooking.common.data.models.api.response;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productbooking/common/data/models/api/response/ProductConfigCategoryApiResponseModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productbooking/common/data/models/api/response/ProductConfigCategoryApiResponseModel;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ProductConfigCategoryApiResponseModel$$serializer implements GeneratedSerializer<ProductConfigCategoryApiResponseModel> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProductConfigCategoryApiResponseModel$$serializer f8150a;
    private static final SerialDescriptor descriptor;

    static {
        ProductConfigCategoryApiResponseModel$$serializer productConfigCategoryApiResponseModel$$serializer = new ProductConfigCategoryApiResponseModel$$serializer();
        f8150a = productConfigCategoryApiResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productbooking.common.data.models.api.response.ProductConfigCategoryApiResponseModel", productConfigCategoryApiResponseModel$$serializer, 9);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("pos", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("proofs", false);
        pluginGeneratedSerialDescriptor.j("isActive", false);
        pluginGeneratedSerialDescriptor.j("isRenewable", false);
        pluginGeneratedSerialDescriptor.j("verification", false);
        pluginGeneratedSerialDescriptor.j("infoNote", false);
        pluginGeneratedSerialDescriptor.j("info", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ProductConfigCategoryApiResponseModel.j;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(IntSerializer.f18146a);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC4 = BuiltinSerializersKt.c((KSerializer) lazyArr[3].getValue());
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(booleanSerializer), BuiltinSerializersKt.c(stringSerializer), BuiltinSerializersKt.c(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        List list;
        String str3;
        Integer num;
        String str4;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ProductConfigCategoryApiResponseModel.j;
        int i2 = 7;
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.f18146a, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            list = list2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            str2 = str8;
            bool2 = bool6;
            bool = bool5;
            i = 511;
            bool3 = bool4;
            str4 = str7;
            num = num2;
            str3 = str6;
        } else {
            int i3 = 3;
            boolean z = true;
            int i4 = 0;
            String str9 = null;
            String str10 = null;
            Boolean bool7 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            List list3 = null;
            Integer num3 = null;
            String str11 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                        i3 = 3;
                        break;
                    case 0:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str5);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 3;
                        break;
                    case 1:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.f18146a, num3);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 3;
                        break;
                    case 2:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str11);
                        i4 |= 4;
                        i2 = 7;
                        i3 = 3;
                        break;
                    case 3:
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, (DeserializationStrategy) lazyArr[i3].getValue(), list3);
                        i4 |= 8;
                        i2 = 7;
                        break;
                    case 4:
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.f18123a, bool9);
                        i4 |= 16;
                        i2 = 7;
                        break;
                    case 5:
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.f18123a, bool7);
                        i4 |= 32;
                        i2 = 7;
                        break;
                    case 6:
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.f18123a, bool8);
                        i4 |= 64;
                        i2 = 7;
                        break;
                    case 7:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.f18170a, str10);
                        i4 |= 128;
                        break;
                    case 8:
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, str9);
                        i4 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            str = str9;
            str2 = str10;
            bool = bool7;
            bool2 = bool8;
            bool3 = bool9;
            list = list3;
            str3 = str5;
            num = num3;
            str4 = str11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProductConfigCategoryApiResponseModel(i, str3, num, str4, list, bool3, bool, bool2, str2, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ProductConfigCategoryApiResponseModel value = (ProductConfigCategoryApiResponseModel) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ProductConfigCategoryApiResponseModel.j;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, value.f8149a);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.f18146a, value.b);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, value.c);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), value.d);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, value.g);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, value.h);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, value.i);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
