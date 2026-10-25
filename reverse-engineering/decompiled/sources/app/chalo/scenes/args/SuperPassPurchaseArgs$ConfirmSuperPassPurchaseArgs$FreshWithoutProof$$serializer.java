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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/scenes/args/SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof$$serializer implements GeneratedSerializer<SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof$$serializer f9311a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof$$serializer superPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof$$serializer = new SuperPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof$$serializer();
        f9311a = superPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.scenes.args.SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof", superPassPurchaseArgs$ConfirmSuperPassPurchaseArgs$FreshWithoutProof$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("bookablePassConfig", false);
        pluginGeneratedSerialDescriptor.j("userDetailsString", false);
        pluginGeneratedSerialDescriptor.j("purchaseStopsInfoString", false);
        pluginGeneratedSerialDescriptor.j("postPassPurchaseSuccessFlowType", false);
        pluginGeneratedSerialDescriptor.j("isPremiumPassLandingFlow", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof.j;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{lazyArr[0].getValue(), stringSerializer, stringSerializer, BuiltinSerializersKt.c(stringSerializer), lazyArr[4].getValue(), BooleanSerializer.f18123a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        Source source;
        String str;
        String str2;
        String str3;
        PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof.j;
        int i2 = 5;
        int i3 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Source source2 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, null);
            postPassPurchaseSuccessFlowType = (PostPassPurchaseSuccessFlowType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), null);
            source = source2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            str3 = str4;
            str2 = strDecodeStringElement2;
            i = 63;
            str = strDecodeStringElement;
        } else {
            int i4 = 1;
            boolean zDecodeBooleanElement2 = false;
            Source source3 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str5 = null;
            PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType2 = null;
            int i5 = 0;
            while (i4 != 0) {
                int i6 = i3;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        i3 = i6;
                        i4 = i3;
                        i2 = 5;
                        break;
                    case 0:
                        source3 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i6, (DeserializationStrategy) lazyArr[i6].getValue(), source3);
                        i5 |= 1;
                        i3 = i6;
                        i2 = 5;
                        break;
                    case 1:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i3 = i6;
                        break;
                    case 2:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i3 = i6;
                        break;
                    case 3:
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, str5);
                        i5 |= 8;
                        i3 = i6;
                        break;
                    case 4:
                        postPassPurchaseSuccessFlowType2 = (PostPassPurchaseSuccessFlowType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy) lazyArr[4].getValue(), postPassPurchaseSuccessFlowType2);
                        i5 |= 16;
                        i3 = i6;
                        break;
                    case 5:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i5 |= 32;
                        i3 = i6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i = i5;
            source = source3;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            str3 = str5;
            postPassPurchaseSuccessFlowType = postPassPurchaseSuccessFlowType2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof(i, source, str, str2, str3, postPassPurchaseSuccessFlowType, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof value = (SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.FreshWithoutProof.j;
        SerializationStrategy serializationStrategy = (SerializationStrategy) lazyArr[0].getValue();
        Source source = value.d;
        boolean z = value.i;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, serializationStrategy, source);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.e);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, value.g);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), value.h);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
