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
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/scenes/args/SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/scenes/args/SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$$serializer implements GeneratedSerializer<SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$$serializer f9315a;
    private static final SerialDescriptor descriptor;

    static {
        SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$$serializer superPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$$serializer = new SuperPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$$serializer();
        f9315a = superPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.scenes.args.SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof", superPassPurchaseArgs$EnterUserDetailsArgs$FreshWithProof$$serializer, 5);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("bookablePassConfig", false);
        pluginGeneratedSerialDescriptor.j("purchaseStopsInfoString", false);
        pluginGeneratedSerialDescriptor.j("postPassPurchaseSuccessFlowType", false);
        pluginGeneratedSerialDescriptor.j("isPremiumPassLandingFlow", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof.j;
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{lazyArr[0].getValue(), stringSerializer, BuiltinSerializersKt.c(stringSerializer), lazyArr[3].getValue(), BooleanSerializer.f18123a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        Source source;
        String str;
        String str2;
        PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof.j;
        int i2 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Source source2 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, null);
            postPassPurchaseSuccessFlowType = (PostPassPurchaseSuccessFlowType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), null);
            source = source2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            str2 = str3;
            i = 31;
            str = strDecodeStringElement;
        } else {
            int i3 = 1;
            boolean zDecodeBooleanElement2 = false;
            Source source3 = null;
            String strDecodeStringElement2 = null;
            String str4 = null;
            PostPassPurchaseSuccessFlowType postPassPurchaseSuccessFlowType2 = null;
            int i4 = 0;
            while (i3 != 0) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                int i5 = i2;
                if (iDecodeElementIndex == -1) {
                    i2 = i5;
                    i3 = i2;
                } else if (iDecodeElementIndex != 0) {
                    if (iDecodeElementIndex == 1) {
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                    } else if (iDecodeElementIndex == 2) {
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, str4);
                        i4 |= 4;
                    } else if (iDecodeElementIndex == 3) {
                        postPassPurchaseSuccessFlowType2 = (PostPassPurchaseSuccessFlowType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy) lazyArr[3].getValue(), postPassPurchaseSuccessFlowType2);
                        i4 |= 8;
                    } else {
                        if (iDecodeElementIndex != 4) {
                            throw new UnknownFieldException(iDecodeElementIndex);
                        }
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i4 |= 16;
                    }
                    i2 = i5;
                } else {
                    source3 = (Source) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, (DeserializationStrategy) lazyArr[i5].getValue(), source3);
                    i4 |= 1;
                    i2 = i5;
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i = i4;
            source = source3;
            str = strDecodeStringElement2;
            str2 = str4;
            postPassPurchaseSuccessFlowType = postPassPurchaseSuccessFlowType2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof(i, source, str, str2, postPassPurchaseSuccessFlowType, zDecodeBooleanElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof value = (SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = SuperPassPurchaseArgs.EnterUserDetailsArgs.FreshWithProof.j;
        SerializationStrategy serializationStrategy = (SerializationStrategy) lazyArr[0].getValue();
        Source source = value.d;
        boolean z = value.h;
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, serializationStrategy, source);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.e);
        compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, value.f);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (SerializationStrategy) lazyArr[3].getValue(), value.g);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 4, z);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
