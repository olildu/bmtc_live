package app.chalo.scenes.args;

import app.chalo.constants.Source;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/scenes/args/ProductSelectionArgs.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/scenes/args/ProductSelectionArgs;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class ProductSelectionArgs$$serializer implements GeneratedSerializer<ProductSelectionArgs> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProductSelectionArgs$$serializer f9299a;
    private static final SerialDescriptor descriptor;

    static {
        ProductSelectionArgs$$serializer productSelectionArgs$$serializer = new ProductSelectionArgs$$serializer();
        f9299a = productSelectionArgs$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.scenes.args.ProductSelectionArgs", productSelectionArgs$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("routeAppModelJson", true);
        pluginGeneratedSerialDescriptor.j("targetConfigId", true);
        pluginGeneratedSerialDescriptor.j("showPremiumBusProductsOnly", true);
        pluginGeneratedSerialDescriptor.j("isFromProductGroupHook", true);
        pluginGeneratedSerialDescriptor.j("previousScreenSource", true);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.j("showPremiumBusProducts", true);
        pluginGeneratedSerialDescriptor.j("deeplinkAttribution", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = ProductSelectionArgs.j;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        KSerializer kSerializerC = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(stringSerializer);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c((KSerializer) lazyArr[4].getValue());
        KSerializer kSerializerC4 = BuiltinSerializersKt.c((KSerializer) lazyArr[5].getValue());
        KSerializer kSerializerC5 = BuiltinSerializersKt.c(stringSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{kSerializerC, kSerializerC2, booleanSerializer, booleanSerializer, kSerializerC3, kSerializerC4, booleanSerializer, kSerializerC5};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        String str;
        Source source;
        Source source2;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        String str3;
        int i2;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ProductSelectionArgs.j;
        int i3 = 7;
        int i4 = 6;
        int i5 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.f18170a;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            Source source3 = (Source) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            Source source4 = (Source) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            source = source4;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            i = 255;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement2;
            z3 = zDecodeBooleanElement;
            source2 = source3;
            str2 = str5;
            str3 = str4;
        } else {
            boolean z4 = true;
            int i6 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            String str6 = null;
            Source source5 = null;
            Source source6 = null;
            String str7 = null;
            boolean zDecodeBooleanElement6 = false;
            String str8 = null;
            while (z4) {
                int i7 = i5;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i4 = 6;
                        i5 = 4;
                        break;
                    case 0:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str7);
                        i6 |= 1;
                        i3 = 7;
                        i4 = 6;
                        i5 = 4;
                        break;
                    case 1:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str8);
                        i6 |= 2;
                        i3 = 7;
                        i4 = 6;
                        i5 = 4;
                        break;
                    case 2:
                        i6 |= 4;
                        i5 = i7;
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i3 = 7;
                        break;
                    case 3:
                        i2 = i7;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = i2;
                        i3 = 7;
                        break;
                    case 4:
                        i2 = i7;
                        source6 = (Source) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, (DeserializationStrategy) lazyArr[i7].getValue(), source6);
                        i6 |= 16;
                        i5 = i2;
                        i3 = 7;
                        break;
                    case 5:
                        source5 = (Source) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), source5);
                        i6 |= 32;
                        i5 = i7;
                        break;
                    case 6:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i6 |= 64;
                        i5 = i7;
                        break;
                    case 7:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.f18170a, str6);
                        i6 |= 128;
                        i5 = i7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i6;
            str = str6;
            source = source5;
            source2 = source6;
            str2 = str8;
            z = zDecodeBooleanElement6;
            z2 = zDecodeBooleanElement4;
            z3 = zDecodeBooleanElement5;
            str3 = str7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProductSelectionArgs(i, str3, str2, z3, z2, source2, source, z, str);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        ProductSelectionArgs value = (ProductSelectionArgs) obj;
        Intrinsics.i(value, "value");
        String str = value.i;
        boolean z = value.h;
        Source source = value.g;
        Source source2 = value.f;
        boolean z2 = value.e;
        boolean z3 = value.d;
        String str2 = value.c;
        String str3 = value.b;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = ProductSelectionArgs.j;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || str3 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, str3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || str2 != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, str2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 3, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || source2 != Source.UNKNOWN) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), source2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || source != Source.UNKNOWN) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), source);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || !z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || str != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, str);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
