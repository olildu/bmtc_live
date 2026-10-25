package app.chalo.productpurchase.passpurchase.ui.proofoverview;

import java.util.Map;
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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewRestoreState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/passpurchase/ui/proofoverview/SuperPassProofOverviewRestoreState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassProofOverviewRestoreState$$serializer implements GeneratedSerializer<SuperPassProofOverviewRestoreState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassProofOverviewRestoreState$$serializer f8480a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassProofOverviewRestoreState$$serializer superPassProofOverviewRestoreState$$serializer = new SuperPassProofOverviewRestoreState$$serializer();
        f8480a = superPassProofOverviewRestoreState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.passpurchase.ui.proofoverview.SuperPassProofOverviewRestoreState", superPassProofOverviewRestoreState$$serializer, 10);
        pluginGeneratedSerialDescriptor.j("reInitiate", true);
        pluginGeneratedSerialDescriptor.j("reApply", true);
        pluginGeneratedSerialDescriptor.j("freshApplication", true);
        pluginGeneratedSerialDescriptor.j("fullName", true);
        pluginGeneratedSerialDescriptor.j("proofUploadDetailsMap", true);
        pluginGeneratedSerialDescriptor.j("areAllProofsUploaded", true);
        pluginGeneratedSerialDescriptor.j("isNameChangeComplete", true);
        pluginGeneratedSerialDescriptor.j("enlargeProofImage", true);
        pluginGeneratedSerialDescriptor.j("shouldShowConsentCheckbox", true);
        pluginGeneratedSerialDescriptor.j("isConsentCheckboxChecked", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = BuiltinSerializersKt.c((KSerializer) SuperPassProofOverviewRestoreState.k[4].getValue());
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(EnlargeProofImageSerializable$$serializer.f8459a);
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{booleanSerializer, booleanSerializer, booleanSerializer, StringSerializer.f18170a, kSerializerC, booleanSerializer, booleanSerializer, kSerializerC2, booleanSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        EnlargeProofImageSerializable enlargeProofImageSerializable;
        Map map;
        int i;
        boolean zDecodeBooleanElement2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassProofOverviewRestoreState.k;
        int i2 = 9;
        int i3 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            boolean zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            EnlargeProofImageSerializable enlargeProofImageSerializable2 = (EnlargeProofImageSerializable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, EnlargeProofImageSerializable$$serializer.f8459a, null);
            boolean zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            map = map2;
            zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            enlargeProofImageSerializable = enlargeProofImageSerializable2;
            z = zDecodeBooleanElement6;
            z2 = zDecodeBooleanElement5;
            str = strDecodeStringElement;
            z3 = zDecodeBooleanElement7;
            z4 = zDecodeBooleanElement4;
            i = 1023;
            z5 = zDecodeBooleanElement3;
        } else {
            boolean z6 = true;
            zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement8 = false;
            boolean zDecodeBooleanElement9 = false;
            boolean zDecodeBooleanElement10 = false;
            boolean zDecodeBooleanElement11 = false;
            boolean zDecodeBooleanElement12 = false;
            EnlargeProofImageSerializable enlargeProofImageSerializable3 = null;
            Map map3 = null;
            String strDecodeStringElement2 = null;
            boolean zDecodeBooleanElement13 = false;
            while (z6) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z6 = false;
                        i2 = 9;
                        break;
                    case 0:
                        i3 |= 1;
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        i2 = 9;
                        break;
                    case 1:
                        zDecodeBooleanElement12 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 9;
                        break;
                    case 2:
                        zDecodeBooleanElement11 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 9;
                        break;
                    case 3:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        map3 = (Map) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), map3);
                        i3 |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement9 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i3 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i3 |= 64;
                        break;
                    case 7:
                        enlargeProofImageSerializable3 = (EnlargeProofImageSerializable) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, EnlargeProofImageSerializable$$serializer.f8459a, enlargeProofImageSerializable3);
                        i3 |= 128;
                        break;
                    case 8:
                        zDecodeBooleanElement10 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i3 |= 256;
                        break;
                    case 9:
                        zDecodeBooleanElement13 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i3 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            enlargeProofImageSerializable = enlargeProofImageSerializable3;
            map = map3;
            i = i3;
            zDecodeBooleanElement2 = zDecodeBooleanElement13;
            z = zDecodeBooleanElement8;
            z2 = zDecodeBooleanElement9;
            z3 = zDecodeBooleanElement10;
            z4 = zDecodeBooleanElement11;
            z5 = zDecodeBooleanElement12;
            str = strDecodeStringElement2;
        }
        boolean z7 = zDecodeBooleanElement;
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassProofOverviewRestoreState(i, z7, z5, z4, str, map, z2, z, enlargeProofImageSerializable, z3, zDecodeBooleanElement2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SuperPassProofOverviewRestoreState value = (SuperPassProofOverviewRestoreState) obj;
        Intrinsics.i(value, "value");
        boolean z = value.j;
        boolean z2 = value.i;
        EnlargeProofImageSerializable enlargeProofImageSerializable = value.h;
        boolean z3 = value.g;
        boolean z4 = value.f;
        Map map = value.e;
        String str = value.d;
        boolean z5 = value.c;
        boolean z6 = value.b;
        boolean z7 = value.f8479a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassProofOverviewRestoreState.k;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || z7) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 0, z7);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || z6) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, z6);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || !z5) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, z5);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.d(str, "")) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || map != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), map);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || z4) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, z4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || z3) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, z3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || enlargeProofImageSerializable != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, EnlargeProofImageSerializable$$serializer.f8459a, enlargeProofImageSerializable);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 8) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 8, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 9) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 9, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
