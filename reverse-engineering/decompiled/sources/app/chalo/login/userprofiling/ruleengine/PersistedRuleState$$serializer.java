package app.chalo.login.userprofiling.ruleengine;

import app.chalo.login.userprofiling.data.UserProfilingHooksRuleConfig;
import app.chalo.login.userprofiling.data.UserProfilingHooksRuleConfig$$serializer;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/login/userprofiling/ruleengine/PersistedRuleState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/login/userprofiling/ruleengine/PersistedRuleState;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class PersistedRuleState$$serializer implements GeneratedSerializer<PersistedRuleState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PersistedRuleState$$serializer f5379a;
    private static final SerialDescriptor descriptor;

    static {
        PersistedRuleState$$serializer persistedRuleState$$serializer = new PersistedRuleState$$serializer();
        f5379a = persistedRuleState$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.login.userprofiling.ruleengine.PersistedRuleState", persistedRuleState$$serializer, 6);
        pluginGeneratedSerialDescriptor.j("userId", false);
        pluginGeneratedSerialDescriptor.j("ruleId", false);
        pluginGeneratedSerialDescriptor.j("cooldownIndex", true);
        pluginGeneratedSerialDescriptor.j("sessionVisibilityStartedOn", true);
        pluginGeneratedSerialDescriptor.j("configLastUsed", true);
        pluginGeneratedSerialDescriptor.j("sessionCountInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerC = BuiltinSerializersKt.c(LongSerializer.f18151a);
        KSerializer kSerializerC2 = BuiltinSerializersKt.c(UserProfilingHooksRuleConfig$$serializer.f5369a);
        KSerializer kSerializerC3 = BuiltinSerializersKt.c(SessionCountInfo$$serializer.f5381a);
        StringSerializer stringSerializer = StringSerializer.f18170a;
        return new KSerializer[]{stringSerializer, stringSerializer, IntSerializer.f18146a, kSerializerC, kSerializerC2, kSerializerC3};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        int i2;
        String str;
        String str2;
        Long l;
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig;
        SessionCountInfo sessionCountInfo;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, null);
            UserProfilingHooksRuleConfig userProfilingHooksRuleConfig2 = (UserProfilingHooksRuleConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, UserProfilingHooksRuleConfig$$serializer.f5369a, null);
            str = strDecodeStringElement;
            sessionCountInfo = (SessionCountInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, SessionCountInfo$$serializer.f5381a, null);
            l = l2;
            userProfilingHooksRuleConfig = userProfilingHooksRuleConfig2;
            i = iDecodeIntElement;
            str2 = strDecodeStringElement2;
            i2 = 63;
        } else {
            boolean z = true;
            int iDecodeIntElement2 = 0;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            Long l3 = null;
            UserProfilingHooksRuleConfig userProfilingHooksRuleConfig3 = null;
            SessionCountInfo sessionCountInfo2 = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i3 |= 4;
                        break;
                    case 3:
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l3);
                        i3 |= 8;
                        break;
                    case 4:
                        userProfilingHooksRuleConfig3 = (UserProfilingHooksRuleConfig) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, UserProfilingHooksRuleConfig$$serializer.f5369a, userProfilingHooksRuleConfig3);
                        i3 |= 16;
                        break;
                    case 5:
                        sessionCountInfo2 = (SessionCountInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, SessionCountInfo$$serializer.f5381a, sessionCountInfo2);
                        i3 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement2;
            i2 = i3;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            l = l3;
            userProfilingHooksRuleConfig = userProfilingHooksRuleConfig3;
            sessionCountInfo = sessionCountInfo2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PersistedRuleState(i2, str, str2, i, l, userProfilingHooksRuleConfig, sessionCountInfo);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        PersistedRuleState value = (PersistedRuleState) obj;
        Intrinsics.i(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        String str = value.f5378a;
        SessionCountInfo sessionCountInfo = value.f;
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig = value.e;
        Long l = value.d;
        int i = value.c;
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, str);
        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.b);
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 2) || i != 0) {
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 2, i);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 3) || l != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.f18151a, l);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 4) || userProfilingHooksRuleConfig != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, UserProfilingHooksRuleConfig$$serializer.f5369a, userProfilingHooksRuleConfig);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 5) || sessionCountInfo != null) {
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, SessionCountInfo$$serializer.f5381a, sessionCountInfo);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
