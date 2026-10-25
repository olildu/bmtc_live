package app.chalo.login.userprofiling.data;

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
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/login/userprofiling/data/UserProfilingHooksRuleConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/login/userprofiling/data/UserProfilingHooksRuleConfig;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class UserProfilingHooksRuleConfig$$serializer implements GeneratedSerializer<UserProfilingHooksRuleConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UserProfilingHooksRuleConfig$$serializer f5369a;
    private static final SerialDescriptor descriptor;

    static {
        UserProfilingHooksRuleConfig$$serializer userProfilingHooksRuleConfig$$serializer = new UserProfilingHooksRuleConfig$$serializer();
        f5369a = userProfilingHooksRuleConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.login.userprofiling.data.UserProfilingHooksRuleConfig", userProfilingHooksRuleConfig$$serializer, 8);
        pluginGeneratedSerialDescriptor.j("ruleId", true);
        pluginGeneratedSerialDescriptor.j("enabled", true);
        pluginGeneratedSerialDescriptor.j("appSessionToDelay", true);
        pluginGeneratedSerialDescriptor.j("loginSessionsToDelay", true);
        pluginGeneratedSerialDescriptor.j("sessionsVisible", true);
        pluginGeneratedSerialDescriptor.j("cooldown", true);
        pluginGeneratedSerialDescriptor.j("loopCooldowns", true);
        pluginGeneratedSerialDescriptor.j("visibleCountsInSession", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        Lazy[] lazyArr = UserProfilingHooksRuleConfig.i;
        BooleanSerializer booleanSerializer = BooleanSerializer.f18123a;
        LongSerializer longSerializer = LongSerializer.f18151a;
        return new KSerializer[]{StringSerializer.f18170a, booleanSerializer, longSerializer, longSerializer, longSerializer, lazyArr[5].getValue(), booleanSerializer, longSerializer};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        boolean zDecodeBooleanElement;
        long j;
        long jDecodeLongElement;
        boolean z;
        String str;
        long j2;
        long j3;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UserProfilingHooksRuleConfig.i;
        int i2 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            long jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
            long jDecodeLongElement3 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
            long jDecodeLongElement4 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), null);
            str = strDecodeStringElement;
            i = 255;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            j = jDecodeLongElement4;
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            z = zDecodeBooleanElement2;
            j2 = jDecodeLongElement2;
            j3 = jDecodeLongElement3;
        } else {
            long jDecodeLongElement5 = 0;
            boolean z2 = true;
            int i3 = 0;
            boolean zDecodeBooleanElement3 = false;
            String strDecodeStringElement2 = null;
            long jDecodeLongElement6 = 0;
            long jDecodeLongElement7 = 0;
            long jDecodeLongElement8 = 0;
            boolean zDecodeBooleanElement4 = false;
            List list2 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 7;
                        break;
                    case 0:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 7;
                        break;
                    case 1:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        jDecodeLongElement7 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        jDecodeLongElement8 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 3);
                        i3 |= 8;
                        break;
                    case 4:
                        jDecodeLongElement5 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 4);
                        i3 |= 16;
                        break;
                    case 5:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy) lazyArr[5].getValue(), list2);
                        i3 |= 32;
                        break;
                    case 6:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i3 |= 64;
                        break;
                    case 7:
                        jDecodeLongElement6 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, i2);
                        i3 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            list = list2;
            zDecodeBooleanElement = zDecodeBooleanElement4;
            j = jDecodeLongElement5;
            jDecodeLongElement = jDecodeLongElement6;
            z = zDecodeBooleanElement3;
            str = strDecodeStringElement2;
            j2 = jDecodeLongElement7;
            j3 = jDecodeLongElement8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UserProfilingHooksRuleConfig(i, str, z, j2, j3, j, list, zDecodeBooleanElement, jDecodeLongElement);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        UserProfilingHooksRuleConfig value = (UserProfilingHooksRuleConfig) obj;
        Intrinsics.i(value, "value");
        long j = value.h;
        boolean z = value.g;
        List list = value.f;
        long j2 = value.e;
        long j3 = value.d;
        long j4 = value.c;
        boolean z2 = value.b;
        String str = value.f5368a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UserProfilingHooksRuleConfig.i;
        int i = 0;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0)) {
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, i, str);
        } else if (!Intrinsics.d(str, "")) {
            i = 0;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, i, str);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || z2) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 1, z2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || j4 != 0) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 2, j4);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || j3 != 0) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 3, j3);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || j2 != 1) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 4, j2);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.d(list, EmptyList.f17557a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 6) || z) {
            compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 6, z);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 7) || j != -1) {
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 7, j);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
