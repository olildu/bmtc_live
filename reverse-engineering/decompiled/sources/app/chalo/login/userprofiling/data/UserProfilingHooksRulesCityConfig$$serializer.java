package app.chalo.login.userprofiling.data;

import in.juspay.hypersdk.analytics.LogConstants;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.PluginHelperInterfacesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"app/chalo/login/userprofiling/data/UserProfilingHooksRulesCityConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lapp/chalo/login/userprofiling/data/UserProfilingHooksRulesCityConfig;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated
public final /* synthetic */ class UserProfilingHooksRulesCityConfig$$serializer implements GeneratedSerializer<UserProfilingHooksRulesCityConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UserProfilingHooksRulesCityConfig$$serializer f5371a;
    private static final SerialDescriptor descriptor;

    static {
        UserProfilingHooksRulesCityConfig$$serializer userProfilingHooksRulesCityConfig$$serializer = new UserProfilingHooksRulesCityConfig$$serializer();
        f5371a = userProfilingHooksRulesCityConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("app.chalo.login.userprofiling.data.UserProfilingHooksRulesCityConfig", userProfilingHooksRulesCityConfig$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("cities", true);
        pluginGeneratedSerialDescriptor.j(LogConstants.DEFAULT_CHANNEL, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{UserProfilingHooksRulesCityConfig.c[0].getValue(), UserProfilingHooksRulesForCity$$serializer.f5373a};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        int i;
        List list;
        UserProfilingHooksRulesForCity userProfilingHooksRulesForCity;
        Intrinsics.i(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UserProfilingHooksRulesCityConfig.c;
        List list2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), null);
            userProfilingHooksRulesForCity = (UserProfilingHooksRulesForCity) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, UserProfilingHooksRulesForCity$$serializer.f5373a, null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            UserProfilingHooksRulesForCity userProfilingHooksRulesForCity2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy) lazyArr[0].getValue(), list2);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    userProfilingHooksRulesForCity2 = (UserProfilingHooksRulesForCity) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, UserProfilingHooksRulesForCity$$serializer.f5373a, userProfilingHooksRulesForCity2);
                    i2 |= 2;
                }
            }
            i = i2;
            list = list2;
            userProfilingHooksRulesForCity = userProfilingHooksRulesForCity2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UserProfilingHooksRulesCityConfig(i, list, userProfilingHooksRulesForCity);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        UserProfilingHooksRulesCityConfig value = (UserProfilingHooksRulesCityConfig) obj;
        Intrinsics.i(value, "value");
        UserProfilingHooksRulesForCity userProfilingHooksRulesForCity = value.b;
        List list = value.f5370a;
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Lazy[] lazyArr = UserProfilingHooksRulesCityConfig.c;
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.d(list, EmptyList.f17557a)) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (SerializationStrategy) lazyArr[0].getValue(), list);
        }
        if (compositeEncoderBeginStructure.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.d(userProfilingHooksRulesForCity, new UserProfilingHooksRulesForCity(LogConstants.DEFAULT_CHANNEL, EmptyList.f17557a))) {
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, UserProfilingHooksRulesForCity$$serializer.f5373a, userProfilingHooksRulesForCity);
        }
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final /* bridge */ KSerializer[] typeParametersSerializers() {
        return PluginHelperInterfacesKt.f18164a;
    }
}
