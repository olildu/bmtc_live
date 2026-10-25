package app.chalo.productpurchase.passpurchase.ui.proofupload;

import app.chalo.superpass.data.models.app.ProofDocumentProps;
import app.chalo.superpass.data.models.app.ProofDocumentProps$$serializer;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadRestoredState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/productpurchase/passpurchase/ui/proofupload/SuperPassUserProofUploadRestoredState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassUserProofUploadRestoredState$$serializer implements GeneratedSerializer<SuperPassUserProofUploadRestoredState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassUserProofUploadRestoredState$$serializer f8509a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassUserProofUploadRestoredState$$serializer superPassUserProofUploadRestoredState$$serializer = new SuperPassUserProofUploadRestoredState$$serializer();
        f8509a = superPassUserProofUploadRestoredState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.productpurchase.passpurchase.ui.proofupload.SuperPassUserProofUploadRestoredState", superPassUserProofUploadRestoredState$$serializer, 3);
        pluginGeneratedSerialDescriptor.j("proofDocProps", true);
        pluginGeneratedSerialDescriptor.j("shouldShowPermissionRationale", true);
        pluginGeneratedSerialDescriptor.j("shouldZoomPlaceholderImage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        return new KSerializer[]{BuiltinSerializersKt.c(ProofDocumentProps$$serializer.f9540a), booleanSerializer, booleanSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        boolean zDecodeBooleanElement2;
        int i;
        ProofDocumentProps proofDocumentProps;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            proofDocumentProps = (ProofDocumentProps) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ProofDocumentProps$$serializer.f9540a, null);
            zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            i = 7;
        } else {
            boolean z = true;
            boolean zDecodeBooleanElement3 = false;
            int i2 = 0;
            ProofDocumentProps proofDocumentProps2 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    proofDocumentProps2 = (ProofDocumentProps) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, ProofDocumentProps$$serializer.f9540a, proofDocumentProps2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                    i2 |= 4;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement3;
            zDecodeBooleanElement2 = zDecodeBooleanElement4;
            i = i2;
            proofDocumentProps = proofDocumentProps2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassUserProofUploadRestoredState(i, proofDocumentProps, zDecodeBooleanElement2, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SuperPassUserProofUploadRestoredState value = (SuperPassUserProofUploadRestoredState) obj;
        Intrinsics.i(value, "value");
        boolean z = value.c;
        boolean z2 = value.b;
        ProofDocumentProps proofDocumentProps = value.f8508a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || proofDocumentProps != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, ProofDocumentProps$$serializer.f9540a, proofDocumentProps);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 2, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
